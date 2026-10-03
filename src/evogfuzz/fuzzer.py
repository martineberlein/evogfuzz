from __future__ import annotations

import random
import re
from collections.abc import Callable
from typing import Any

from evogfuzz.derivation_tree import RE_NONTERMINAL, is_nonterminal
from evogfuzz.grammar import exp_string, is_valid_grammar, nonterminals
from evogfuzz.parser import START_SYMBOL, tree_to_string
from evogfuzz.types import Expansion, Grammar

__all__ = ["Fuzzer", "GrammarFuzzer", "expansion_to_children"]


def expansion_to_children(expansion: Expansion) -> list[tuple[str, list[Any] | None]]:
    """Convert an expansion string into a list of initial child nodes (nonterminals get None)."""
    expansion_str = exp_string(expansion)
    if expansion_str == "":
        return [("", [])]
    strings = [s for s in re.split(RE_NONTERMINAL, expansion_str) if len(s) > 0]
    return [(s, None) if is_nonterminal(s) else (s, []) for s in strings]


class Fuzzer:
    """Base class for fuzzers."""

    def __init__(self) -> None:
        pass

    def fuzz(self) -> str:
        """Produce a fuzzed string."""
        return ""

    def run(self) -> str:
        """Execute the fuzzer and return produced string."""
        return self.fuzz()


class GrammarFuzzer(Fuzzer):
    """Produce strings and derivation trees from grammars."""

    def __init__(
        self,
        grammar: Grammar,
        start_symbol: str = START_SYMBOL,
        min_nonterminals: int = 0,
        max_nonterminals: int = 10,
        disp: bool = False,
        log: bool | int = False,
    ) -> None:
        """Initialize the grammar fuzzer.

        Args:
            grammar: The context-free grammar to generate from.
            start_symbol: Root symbol to begin derivations.
            min_nonterminals: Minimum non-terminals to expand before winding down.
            max_nonterminals: Maximum non-terminals before forced minimum cost expansion.
            disp: Display trees visually if True.
            log: Logging verbosity flag.
        """
        super().__init__()
        self.grammar: Grammar = grammar
        self.start_symbol: str = start_symbol
        self.min_nonterminals: int = min_nonterminals
        self.max_nonterminals: int = max_nonterminals
        self.disp: bool = disp
        self.log: bool | int = log
        self.derivation_tree: Any = None
        self.check_grammar()

    def check_grammar(self) -> None:
        """Verify the integrity of the fuzzer grammar."""
        assert self.start_symbol in self.grammar
        assert is_valid_grammar(self.grammar, start_symbol=self.start_symbol)

    def init_tree(self) -> tuple[str, None]:
        """Create the unexpanded root tree node."""
        return (self.start_symbol, None)

    def choose_node_expansion(
        self, node: Any, children_alternatives: list[list[Any]]
    ) -> int:
        """Select an expansion alternative index randomly."""
        return random.randrange(0, len(children_alternatives))

    def expansion_to_children(self, expansion: Expansion) -> list[Any]:
        return expansion_to_children(expansion)

    def expand_node_randomly(self, node: Any) -> Any:
        symbol, children = node
        assert children is None
        expansions = self.grammar[symbol]
        children_alternatives = [
            self.expansion_to_children(expansion) for expansion in expansions
        ]
        index = self.choose_node_expansion(node, children_alternatives)
        chosen_children = children_alternatives[index]
        chosen_children = self.process_chosen_children(
            chosen_children, expansions[index]
        )
        return (symbol, chosen_children)

    def process_chosen_children(
        self, chosen_children: list[Any], expansion: Expansion
    ) -> list[Any]:
        return chosen_children

    def possible_expansions(self, node: Any) -> int:
        symbol, children = node
        if children is None:
            return 1
        return sum(self.possible_expansions(c) for c in children)

    def any_possible_expansions(self, node: Any) -> bool:
        symbol, children = node
        if children is None:
            return True
        return any(self.any_possible_expansions(c) for c in children)

    def choose_tree_expansion(self, tree: Any, children: list[Any]) -> int:
        return random.randrange(0, len(children))

    def expand_tree_once(self, tree: Any) -> Any:
        symbol, children = tree
        if children is None:
            return self.expand_node(tree)

        expandable_children = [c for c in children if self.any_possible_expansions(c)]
        index_map = [i for (i, c) in enumerate(children) if c in expandable_children]
        child_to_be_expanded = self.choose_tree_expansion(tree, expandable_children)
        children[index_map[child_to_be_expanded]] = self.expand_tree_once(
            expandable_children[child_to_be_expanded]
        )
        return tree

    def symbol_cost(self, symbol: str, seen: set[str] | None = None) -> int | float:
        if seen is None:
            seen = set()
        expansions = self.grammar[symbol]
        return min(self.expansion_cost(e, seen | {symbol}) for e in expansions)

    def expansion_cost(
        self, expansion: Expansion, seen: set[str] | None = None
    ) -> int | float:
        if seen is None:
            seen = set()
        symbols = nonterminals(expansion)
        if len(symbols) == 0:
            return 1
        if any(s in seen for s in symbols):
            return float("inf")
        return sum(self.symbol_cost(s, seen) for s in symbols) + 1

    def expand_node_by_cost(
        self, node: Any, choose: Callable[[list[Any]], Any] = min
    ) -> Any:
        symbol, children = node
        assert children is None
        expansions = self.grammar[symbol]
        children_alternatives_with_cost = [
            (
                self.expansion_to_children(expansion),
                self.expansion_cost(expansion, {symbol}),
                expansion,
            )
            for expansion in expansions
        ]
        costs = [cost for (_, cost, _) in children_alternatives_with_cost]
        chosen_cost = choose(costs)
        children_with_chosen_cost = [
            child
            for (child, child_cost, _) in children_alternatives_with_cost
            if child_cost == chosen_cost
        ]
        expansion_with_chosen_cost = [
            expansion
            for (_, child_cost, expansion) in children_alternatives_with_cost
            if child_cost == chosen_cost
        ]
        index = self.choose_node_expansion(node, children_with_chosen_cost)
        chosen_children = children_with_chosen_cost[index]
        chosen_expansion = expansion_with_chosen_cost[index]
        chosen_children = self.process_chosen_children(
            chosen_children, chosen_expansion
        )
        return (symbol, chosen_children)

    def expand_node_min_cost(self, node: Any) -> Any:
        return self.expand_node_by_cost(node, min)

    def expand_node_max_cost(self, node: Any) -> Any:
        return self.expand_node_by_cost(node, max)

    def expand_node(self, node: Any) -> Any:
        return self.expand_node_randomly(node)

    def expand_tree_with_strategy(
        self,
        tree: Any,
        expand_node_method: Callable[[Any], Any],
        limit: int | None = None,
    ) -> Any:
        self.expand_node = expand_node_method
        while (
            limit is None or self.possible_expansions(tree) < limit
        ) and self.any_possible_expansions(tree):
            tree = self.expand_tree_once(tree)
        return tree

    def expand_tree(self, tree: Any) -> Any:
        tree = self.expand_tree_with_strategy(
            tree, self.expand_node_max_cost, self.min_nonterminals
        )
        tree = self.expand_tree_with_strategy(
            tree, self.expand_node_randomly, self.max_nonterminals
        )
        tree = self.expand_tree_with_strategy(tree, self.expand_node_min_cost)
        assert self.possible_expansions(tree) == 0
        return tree

    def fuzz_tree(self) -> Any:
        """Produce a complete derivation tree from grammar."""
        tree = self.init_tree()
        return self.expand_tree(tree)

    def fuzz(self) -> str:
        """Produce a string derived from grammar."""
        self.derivation_tree = self.fuzz_tree()
        return tree_to_string(self.derivation_tree)
