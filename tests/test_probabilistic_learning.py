import unittest

from evogfuzz.parser import EarleyParser
from evogfuzz.derivation_tree import DerivationTree

from evogfuzz.grammar import is_valid_grammar, tree_to_string
from evogfuzz.types import Grammar
from tests.calculator import (
    calculator_grammar as grammar,
)


from evogfuzz.probabilistic_fuzzer import ProbabilisticGrammarMinerExtended
from evogfuzz.input import Input


class TestProbabilisticLearner(unittest.TestCase):
    def setUp(self) -> None:
        self.grammar: Grammar = {
            "<start>": ["<maybe_minus><number>"],
            "<maybe_minus>": ["", "-"],
            "<number>": ["1", "2", "3"],
        }
        self.initial_inputs = ["-1", "3", "2", "1"]
        assert is_valid_grammar(grammar=self.grammar)
        p = EarleyParser(self.grammar)
        for inp in self.initial_inputs:
            for tree in p.parse(inp):
                assert tree_to_string(tree) == inp

    def test_probabilistic_miner(self):
        probabilistic_grammar_miner = ProbabilisticGrammarMinerExtended(
            EarleyParser(self.grammar)
        )
        probabilistic_grammar = probabilistic_grammar_miner.mine_probabilistic_grammar(
            list(self.initial_inputs)
        )

        expected = {
            "<start>": [("<maybe_minus><number>", {"prob": None})],
            "<maybe_minus>": [("", {"prob": 0.75}), ("-", {"prob": 0.25})],
            "<number>": [
                ("1", {"prob": 0.5}),
                ("2", {"prob": 0.25}),
                ("3", {"prob": 0.25}),
            ],
        }
        self.assertEqual(expected, probabilistic_grammar)

        for rule in probabilistic_grammar:
            print(rule.ljust(30) + str(probabilistic_grammar[rule]))

    def test_probabilistic_miner_new(self):
        grammar_maybe_minus: Grammar = {
            "<start>": ["<number>"],
            "<number>": ["<maybe_minus><one_nine>"],
            "<maybe_minus>": ["-", ""],
            "<one_nine>": [str(i) for i in range(1, 10)],
        }
        assert is_valid_grammar(grammar=grammar_maybe_minus)
        initial_inputs_maybe_minus = ["-8", "-9"]

        probabilistic_grammar_miner = ProbabilisticGrammarMinerExtended(
            EarleyParser(grammar_maybe_minus)
        )
        probabilistic_grammar = probabilistic_grammar_miner.mine_probabilistic_grammar(
            initial_inputs_maybe_minus
        )

        expected = {
            "<start>": [("<number>", {"prob": None})],
            "<maybe_minus>": [("-", {"prob": 1.0}), ("", {"prob": 0.0})],
            "<number>": [("<maybe_minus><one_nine>", {"prob": None})],
            "<one_nine>": [
                ("1", {"prob": 0.0}),
                ("2", {"prob": 0.0}),
                ("3", {"prob": 0.0}),
                ("4", {"prob": 0.0}),
                ("5", {"prob": 0.0}),
                ("6", {"prob": 0.0}),
                ("7", {"prob": 0.0}),
                ("8", {"prob": 0.5}),
                ("9", {"prob": 0.5}),
            ],
        }
        self.assertEqual(expected, probabilistic_grammar)

    def test_extended_probabilistic_miner(self):
        e_parser = EarleyParser(grammar=grammar)

        test_inputs = set()
        for inp_ in ["sqrt(-900)", "cos(12)"]:
            test_inputs.add(
                Input(
                    DerivationTree.from_parse_tree(
                        next(EarleyParser(grammar).parse(inp_))
                    )
                )
            )
        miner = ProbabilisticGrammarMinerExtended(parser=e_parser)

        probabilistic_grammar = miner.mine_probabilistic_grammar(test_inputs)

        expected = {
            "<start>": [("<arith_expr>", {"prob": None})],
            "<arith_expr>": [("<function>(<number>)", {"prob": None})],
            "<digit>": [
                ("0", {"prob": 0.6666666666666666}),
                ("1", {"prob": 0.0}),
                ("2", {"prob": 0.3333333333333333}),
                ("3", {"prob": 0.0}),
                ("4", {"prob": 0.0}),
                ("5", {"prob": 0.0}),
                ("6", {"prob": 0.0}),
                ("7", {"prob": 0.0}),
                ("8", {"prob": 0.0}),
                ("9", {"prob": 0.0}),
            ],
            "<digits>": [
                ("<digit>", {"prob": 0.6666666666666666}),
                ("<digit><digits>", {"prob": 0.3333333333333333}),
            ],
            "<function>": [
                ("sqrt", {"prob": 0.5}),
                ("sin", {"prob": 0.0}),
                ("cos", {"prob": 0.5}),
                ("tan", {"prob": 0.0}),
            ],
            "<maybe_digits>": [("", {"prob": 0.0}), ("<digits>", {"prob": 1.0})],
            "<maybe_frac>": [("", {"prob": 1.0}), (".<digits>", {"prob": 0.0})],
            "<maybe_minus>": [("", {"prob": 0.5}), ("-", {"prob": 0.5})],
            "<number>": [
                ("<maybe_minus><one_nine><maybe_digits><maybe_frac>", {"prob": None})
            ],
            "<one_nine>": [
                ("1", {"prob": 0.5}),
                ("2", {"prob": 0.0}),
                ("3", {"prob": 0.0}),
                ("4", {"prob": 0.0}),
                ("5", {"prob": 0.0}),
                ("6", {"prob": 0.0}),
                ("7", {"prob": 0.0}),
                ("8", {"prob": 0.0}),
                ("9", {"prob": 0.5}),
            ],
        }

        self.assertEqual(expected, probabilistic_grammar)
