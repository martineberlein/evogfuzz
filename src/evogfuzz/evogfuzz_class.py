from __future__ import annotations

from collections.abc import Callable
from copy import deepcopy
from pathlib import Path
from random import choice
from typing import Any

import numpy as np

from evogfuzz.derivation_tree import DerivationTree
from evogfuzz.execution import (
    BatchExecutionHandler,
    ManageTimeout,
    MultipleFailureReport,
    Report,
    SingleExecutionHandler,
    SingleFailureReport,
)
from evogfuzz.fitness_functions import fitness_function_failure
from evogfuzz.grammar import is_valid_probabilistic_grammar
from evogfuzz.grammar_transformation import (
    get_transformed_grammar,
    get_transformed_grammar_from_strings,
)
from evogfuzz.input import Input
from evogfuzz.logger import LOGGER
from evogfuzz.oracle import OracleResult
from evogfuzz.parser import EarleyParser
from evogfuzz.probabilistic_fuzzer import (
    ProbabilisticGrammarMinerExtended,
    ProbabilisticGrammarFuzzer,
)
from evogfuzz.tournament_selection import Tournament
from evogfuzz.types import Grammar, GrammarType, OracleType, Scenario

__all__ = ["EvoGFrame", "EvoGFuzz", "EvoGGen"]


class EvoGFrame:
    """Evolutionary grammar-based fuzzing and generation framework."""

    scenario: Scenario = Scenario.FUZZING

    def __init__(
        self,
        grammar: Grammar,
        oracle: OracleType,
        inputs: list[str],
        fitness_function: Callable[[Input], float] = fitness_function_failure,
        iterations: int = 10,
        use_multi_failure_report: bool = True,
        use_batch_execution: bool = False,
        transform_grammar: bool = False,
        working_dir: Path | None = None,
        logging: bool = False,
    ) -> None:
        self.grammar: Grammar = grammar
        self._oracle: OracleType = oracle
        self.working_dir: Path | None = working_dir
        self._probabilistic_grammars: list[tuple[Grammar, GrammarType, float]] = []
        self._iteration: int = 0
        self._max_iterations: int = iterations
        self._number_individuals: int = 100
        self._parameter_lambda: float = 2.0
        self._elitism_rate: int = 5
        self._tournament_size: int = 4
        self._tournament_number: int = 25
        self._all_inputs: set[Input] = set()
        self._avg_prev_data: float = 0.0
        self.fitness_function: Callable[[Input], float] = fitness_function
        self.logging: bool = logging

        self.found_exceptions: set[Any] = set()

        self.report: Report = (
            MultipleFailureReport()
            if use_multi_failure_report
            else SingleFailureReport()
        )

        self.execution_handler: SingleExecutionHandler | BatchExecutionHandler = (
            BatchExecutionHandler(self._oracle)
            if use_batch_execution
            else SingleExecutionHandler(self._oracle)
        )

        if transform_grammar:
            self.grammar = get_transformed_grammar_from_strings(
                inputs, self.grammar, recursive=False
            )

        self._probabilistic_grammar_miner = ProbabilisticGrammarMinerExtended(
            EarleyParser(self.grammar)
        )

        self.inputs: set[Input] = set()
        for inp in inputs:
            self.inputs.add(
                Input(
                    DerivationTree.from_parse_tree(
                        next(EarleyParser(grammar).parse(inp))
                    )
                )
            )

    def _setup(self) -> set[Input]:
        self.execution_handler.label(self.inputs, self.report)

        probabilistic_grammar = self._learn_probabilistic_grammar(self.inputs)
        self._probabilistic_grammars.append(
            (deepcopy(probabilistic_grammar), GrammarType.LEARNED, -1.0)
        )
        return self._generate_input_files(probabilistic_grammar)

    def _loop(self, test_inputs: set[Input]) -> set[Input]:
        LOGGER.info("Executing new Inputs.")
        self.execution_handler.label(test_inputs, self.report)

        valid_inputs = {
            inp for inp in test_inputs if inp.oracle is not OracleResult.UNDEFINED
        }

        LOGGER.info("Determining Fitness.")
        for inp in valid_inputs:
            inp.fitness = self.fitness_function(inp)

        for inp in valid_inputs:
            self._all_inputs.add(inp)

        LOGGER.info("Selecting best Inputs.")
        fittest_individuals: set[Input] = self._select_fittest_individuals(valid_inputs)

        LOGGER.info("Learning new probabilistic Grammar.")
        probabilistic_grammar = self._learn_probabilistic_grammar(fittest_individuals)
        self._probabilistic_grammars.append(
            (deepcopy(probabilistic_grammar), GrammarType.LEARNED, -1.0)
        )

        LOGGER.info("Mutating Grammar.")
        mutated_grammar = self._mutate_grammar(probabilistic_grammar)
        self._probabilistic_grammars.append(
            (mutated_grammar, GrammarType.MUTATED, -1.0)
        )

        try:
            with ManageTimeout(2):
                new_inputs = self._generate_input_files(mutated_grammar)
        except TimeoutError:
            LOGGER.info("Timeout while generating new Inputs!")
            new_inputs = self.inputs

        return new_inputs

    def _do_more_iterations(self) -> bool:
        if self._max_iterations == -1:
            return True
        if self._iteration >= self._max_iterations:
            if self.logging:
                LOGGER.info("Terminate due to maximal iterations reached")
            return False
        return True

    def _generate_input_files(self, probabilistic_grammar: Grammar) -> set[Input]:
        if self.logging:
            LOGGER.info("Generating new Test Inputs")
        probabilistic_fuzzer = ProbabilisticGrammarFuzzer(probabilistic_grammar)
        new_test_inputs: set[Input] = set()
        for _ in range(self._number_individuals):
            new_test_inputs.add(
                Input(DerivationTree.from_parse_tree(probabilistic_fuzzer.fuzz_tree()))
            )
        if self.logging:
            LOGGER.info("Generated %d new Test Inputs", len(new_test_inputs))
        return new_test_inputs

    def _safe_fitness_for_grammar(self, sum_fitness: float) -> None:
        grammar, grammar_type, _ = self._probabilistic_grammars.pop()
        self._probabilistic_grammars.append((grammar, grammar_type, sum_fitness))

    def _select_fittest_individuals(self, test_inputs: set[Input]) -> set[Input]:
        fittest_individuals = Tournament(
            test_inputs, self._tournament_number, self._tournament_size
        ).select_fittest_individuals()

        sum_fitness = sum(inp.fitness for inp in fittest_individuals)
        if self.logging:
            LOGGER.debug(
                "Current probabilistic grammar achieved combined fitness of: %f",
                sum_fitness,
            )
        self._safe_fitness_for_grammar(sum_fitness)

        return fittest_individuals

    def _learn_probabilistic_grammar(
        self, test_inputs: set[Input], reset: bool = True
    ) -> Grammar:
        if self.logging:
            LOGGER.info("Learning new Grammar")

        if reset:
            self._probabilistic_grammar_miner.reset()

        probabilistic_grammar = (
            self._probabilistic_grammar_miner.mine_probabilistic_grammar(test_inputs)
        )

        assert is_valid_probabilistic_grammar(probabilistic_grammar), (
            "Exit! Newly generated Grammar is not valid!"
        )

        return probabilistic_grammar

    @staticmethod
    def _mutate_grammar(probabilistic_grammar: Grammar) -> Grammar:
        LOGGER.info("Mutating new Grammar")

        mutated_grammar = deepcopy(probabilistic_grammar)
        filtered = [rule for rule in mutated_grammar if len(mutated_grammar[rule]) > 1]
        selected = choice(filtered)
        LOGGER.debug("Selected rule %s to be mutated.", selected)
        new_probs = np.random.random(size=len(mutated_grammar[selected]))
        new_probs /= new_probs.sum()

        for count, child in enumerate(mutated_grammar[selected]):
            child[1]["prob"] = float(new_probs[count])

        for rule in mutated_grammar:
            LOGGER.debug("%s %s", rule.ljust(30), str(mutated_grammar[rule]))

        return mutated_grammar

    def _finalize(self, **kwargs: Any) -> None:
        if self.logging:
            LOGGER.info("Exiting EvoGFuzz!")
            LOGGER.info("Final Grammar:")

        final_grammar = self._get_latest_grammar()

        for rule in final_grammar:
            if self.logging:
                LOGGER.info("%s %s", rule.ljust(30), str(final_grammar[rule]))

    def _get_latest_grammar(self) -> Grammar:
        return self._probabilistic_grammars[-1][0]

    def _check_part_of_language(self, inp: str) -> bool:
        parser = EarleyParser(self.grammar)
        try:
            list(parser.parse(inp))
            return True
        except SyntaxError:
            return False

    def get_found_exceptions_inputs(self) -> set[Input]:
        return set(self.report.get_all_failing_inputs())

    def get_found_exceptions_strings(self) -> set[str]:
        return {str(inp) for inp in self.report.get_all_failing_inputs()}

    def get_last_grammar(self) -> Grammar:
        return self._get_latest_grammar()

    def get_all_inputs(self) -> set[Input]:
        return self._all_inputs


class EvoGFuzz(EvoGFrame):
    """Evolutionary Grammar-based Fuzzer."""

    def fuzz(self) -> set[Input]:
        """Run evolutionary fuzzing across iterations and return all discovered failing inputs."""
        if self.logging:
            LOGGER.info("Fuzzing with EvoGFuzz")
        new_population: set[Input] = self._setup()

        while self._do_more_iterations():
            if self.logging:
                LOGGER.info("Starting iteration %d", self._iteration)
            new_population = self._loop(new_population)
            self._iteration += 1

        self._finalize()
        return self.get_found_exceptions_inputs()


class EvoGGen(EvoGFrame):
    """EvoGGen learns a probabilistic grammar specifically tailored to reproduce defect properties."""

    def __init__(
        self,
        grammar: Grammar,
        oracle: Callable[[Input | str], tuple[OracleResult, Exception | None]],
        inputs: list[str],
        fitness_function: Callable[[Input], float] = fitness_function_failure,
        iterations: int = 10,
        transform_grammar: bool = False,
        logging: bool = False,
    ) -> None:
        super().__init__(
            grammar=grammar,
            oracle=oracle,
            inputs=inputs,
            fitness_function=fitness_function,
            iterations=iterations,
            logging=logging,
        )
        self.transform_grammar: bool = transform_grammar
        self.failure_inducing_inputs: set[Input] = set()

    def _setup(self) -> set[Input]:
        for inp in self.inputs:
            inp.oracle, _ = self._oracle(inp)

        self.failure_inducing_inputs.update(
            {inp for inp in self.inputs if inp.oracle is OracleResult.FAILING}
        )

        assert any(inp.oracle is OracleResult.FAILING for inp in self.inputs), (
            "EvoGGen needs at least one bug-triggering input."
        )

        if self.transform_grammar:
            self.grammar = get_transformed_grammar(
                self.failure_inducing_inputs, self.grammar, recursive=False
            )
            self._probabilistic_grammar_miner = ProbabilisticGrammarMinerExtended(
                EarleyParser(self.grammar)
            )
        return self.failure_inducing_inputs

    def optimize(self) -> tuple[Grammar, set[Input]]:
        """Run the optimization loop to isolate failure-inducing probabilistic rules."""
        if self.logging:
            LOGGER.info("Optimizing with EvoGGen")
        self.scenario = Scenario.GENERATOR

        self._setup()

        new_test_inputs = self.failure_inducing_inputs
        while self._do_more_iterations():
            if self.logging:
                LOGGER.info("Starting Iteration %d", self._iteration)
            generated_inputs = self._optimize_loop(new_test_inputs)
            new_test_inputs = {
                inp for inp in generated_inputs if inp.oracle is OracleResult.FAILING
            }
            self.failure_inducing_inputs.update(new_test_inputs)
            self._iteration += 1

        return self._finalize(failing_test_inputs=self.failure_inducing_inputs)

    def _optimize_loop(self, failing_test_inputs: set[Input]) -> set[Input]:
        for inp in failing_test_inputs:
            inp.fitness = self.fitness_function(inp)

        learning_set = failing_test_inputs - self.failure_inducing_inputs

        probabilistic_grammar = self._learn_probabilistic_grammar(
            learning_set, reset=False
        )
        self._probabilistic_grammars.append(
            (deepcopy(probabilistic_grammar), GrammarType.LEARNED, -1.0)
        )

        mutated_grammar = self._mutate_grammar(probabilistic_grammar)
        self._probabilistic_grammars.append(
            (mutated_grammar, GrammarType.MUTATED, -1.0)
        )

        new_inputs: set[Input] = set()
        new_inputs.update(self._generate_input_files(probabilistic_grammar))
        new_inputs.update(self._generate_input_files(mutated_grammar))

        for inp in new_inputs:
            label, _ = self._oracle(inp)
            inp.oracle = label

        return new_inputs

    def _finalize(self, failing_test_inputs: set[Input]) -> tuple[Grammar, set[Input]]:
        return (
            self._learn_probabilistic_grammar(failing_test_inputs, reset=True),
            failing_test_inputs,
        )
