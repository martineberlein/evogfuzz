from __future__ import annotations

import random
from typing import Any

from evogfuzz.derivation_tree import DerivationTree, is_nonterminal
from evogfuzz.fuzzer import GrammarFuzzer
from evogfuzz.grammar import (
    all_terminals,
    exp_probabilities,
    expansion_key,
    extend_grammar,
    set_prob,
)
from evogfuzz.input import Input
from evogfuzz.parser import Parser
from evogfuzz.types import Grammar

__all__ = [
    "ProbabilisticGrammarFuzzer",
    "ExpansionCountMiner",
    "ProbabilisticGrammarMinerExtended",
]


class ProbabilisticGrammarFuzzer(GrammarFuzzer):
    """Grammar fuzzer that samples expansions according to probability weights."""

    def choose_node_expansion(
        self, node: Any, children_alternatives: list[list[Any]]
    ) -> int:
        symbol, _ = node
        expansions = self.grammar[symbol]
        probabilities = exp_probabilities(expansions, symbol)

        weights: list[float] = []
        for children in children_alternatives:
            expansion = all_terminals((symbol, children))
            children_weight = probabilities.get(expansion, 0.0)
            if self.log:
                print(f"{expansion!r} p = {children_weight}")
            weights.append(children_weight)

        if sum(weights) == 0:
            return random.choices(range(len(children_alternatives)))[0]
        return random.choices(range(len(children_alternatives)), weights=weights)[0]


class ExpansionCountMiner:
    """Mines the frequency of grammar rule expansions from sample inputs."""

    def __init__(self, parser: Parser, log: bool = False) -> None:
        self.grammar: Grammar = extend_grammar(parser.grammar())
        self.parser: Parser = parser
        self.log: bool = log
        self.expansion_counts: dict[str, int] = {}
        self.reset()

    def reset(self) -> None:
        """Reset internal expansion occurrence counters."""
        self.expansion_counts = {}

    def add_coverage(self, symbol: str, children: list[Any]) -> None:
        """Record an observation of a symbol expanding into children."""
        key = expansion_key(symbol, children)
        if self.log:
            print("Found", key)
        self.expansion_counts[key] = self.expansion_counts.get(key, 0) + 1

    def add_tree(self, tree: Any) -> None:
        """Recursively count expansions in a derivation tree."""
        symbol, children = tree
        if not is_nonterminal(symbol):
            return
        assert children is not None
        direct_children = [
            (s, None) if is_nonterminal(s) else (s, []) for s, _ in children
        ]
        self.add_coverage(symbol, direct_children)
        for c in children:
            self.add_tree(c)

    def count_expansions(self, inputs: list[str] | set[Input]) -> None:
        """Count rule expansions across the provided collection of test inputs."""
        for inp in inputs:
            if isinstance(inp, str):
                tree, *_ = self.parser.parse(inp)
            elif isinstance(inp, Input):
                tree = inp.tree
            else:
                raise AssertionError(f"Could not learn from input {inp!r}")
            self.add_tree(tree)

    def counts(self) -> dict[str, int]:
        """Return the dictionary of recorded expansion counts."""
        return self.expansion_counts


class ProbabilisticGrammarMinerExtended(ExpansionCountMiner):
    """Mines probabilistic grammars from sample execution inputs."""

    def set_probabilities(self, counts: dict[str, int]) -> None:
        """Assign normalized expansion probabilities to all rules in the grammar."""
        for symbol in self.grammar:
            self.set_expansion_probabilities(symbol, counts)

    def set_expansion_probabilities(self, symbol: str, counts: dict[str, int]) -> None:
        expansions = self.grammar[symbol]
        if len(expansions) == 1:
            set_prob(self.grammar, symbol, expansions[0], None)
            return

        expansion_counts = [
            counts.get(expansion_key(symbol, expansion), 0) for expansion in expansions
        ]
        total = sum(expansion_counts)
        for i, expansion in enumerate(expansions):
            p = expansion_counts[i] / total if total > 0 else None
            set_prob(self.grammar, symbol, expansion, p)

    def mine_probabilistic_grammar(
        self, inputs: list[str] | set[Input]
    ) -> Grammar:
        """Derive a probabilistic grammar by learning expansion distributions from inputs."""
        self.count_expansions(inputs)
        self.set_probabilities(self.counts())
        return self.grammar
