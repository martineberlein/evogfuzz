from __future__ import annotations

import copy
import re
from typing import Any, cast

from evogfuzz.derivation_tree import RE_NONTERMINAL, DerivationTree, is_nonterminal
from evogfuzz.parser import START_SYMBOL, tree_to_string
from evogfuzz.types import Expansion, Grammar, Option

__all__ = [
    "exp_string",
    "exp_opts",
    "exp_opt",
    "exp_prob",
    "opts",
    "set_opts",
    "set_prob",
    "prob_distribution",
    "exp_probabilities",
    "nonterminals",
    "def_used_nonterminals",
    "reachable_nonterminals",
    "is_valid_grammar",
    "is_valid_probabilistic_grammar",
    "all_terminals",
    "expansion_key",
    "extend_grammar",
    "is_nonterminal",
    "RE_NONTERMINAL",
    "tree_to_string",
]


def exp_string(expansion: Expansion) -> str:
    """Extract string component from an expansion."""
    if isinstance(expansion, str):
        return expansion
    return expansion[0]


def exp_opts(expansion: Expansion) -> dict[str, Any]:
    """Extract the options dictionary from an expansion, or empty dict if none."""
    if isinstance(expansion, str):
        return {}
    return expansion[1]


def exp_opt(expansion: Expansion, attribute: str) -> Any:
    """Retrieve an option attribute from an expansion."""
    return exp_opts(expansion).get(attribute, None)


def exp_prob(expansion: Expansion) -> float | None:
    """Retrieve the assigned probability from an expansion, or None if unspecified."""
    return exp_opt(expansion, "prob")


def opts(**kwargs: Any) -> dict[str, Any]:
    """Helper to construct an options dictionary."""
    return kwargs


def set_opts(
    grammar: Grammar, symbol: str, expansion: Expansion, opts_dict: Option | None = None
) -> None:
    """Set or update options for an expansion within a grammar symbol in-place."""
    if opts_dict is None:
        opts_dict = {}

    expansions = grammar[symbol]
    for i, exp in enumerate(expansions):
        if exp_string(exp) != exp_string(expansion):
            continue

        new_opts = exp_opts(exp)
        if not opts_dict or not new_opts:
            new_opts = dict(opts_dict)
        else:
            new_opts = dict(new_opts)
            new_opts.update(opts_dict)

        if not new_opts:
            grammar[symbol][i] = exp_string(exp)
        else:
            grammar[symbol][i] = (exp_string(exp), new_opts)
        return


def set_prob(
    grammar: Grammar, symbol: str, expansion: Expansion, prob: float | None
) -> None:
    """Assign an expansion probability for a rule symbol in a grammar."""
    set_opts(grammar, symbol, expansion, opts(prob=prob))


def prob_distribution(
    probabilities: list[float | None], nonterminal: str = "<symbol>"
) -> list[float]:
    """Normalize and fill in unspecified probabilities to sum to 1.0.

    Args:
        probabilities: List of floats or None for unspecified probabilities.
        nonterminal: Non-terminal name used in error reporting.

    Returns:
        List of complete normalized probabilities summing to 1.0.
    """
    epsilon = 0.00001
    number_of_unspecified_probabilities = probabilities.count(None)

    if number_of_unspecified_probabilities == 0:
        sum_probabilities = cast(float, sum(probabilities))  # type: ignore[arg-type]
        assert abs(sum_probabilities - 1.0) < epsilon, (
            f"{nonterminal}: sum of probabilities must be 1.0 (got {sum_probabilities})"
        )
        return [float(p) for p in probabilities if p is not None]

    sum_of_specified_probabilities = sum(p for p in probabilities if p is not None)
    assert 0 <= sum_of_specified_probabilities <= 1.0, (
        f"{nonterminal}: sum of specified probabilities must be between 0.0 and 1.0"
    )

    default_probability = (
        1.0 - sum_of_specified_probabilities
    ) / number_of_unspecified_probabilities
    all_probabilities: list[float] = [
        default_probability if p is None else p for p in probabilities
    ]

    assert abs(sum(all_probabilities) - 1.0) < epsilon
    return all_probabilities


def exp_probabilities(
    expansions: list[Expansion], nonterminal: str = "<symbol>"
) -> dict[str, float]:
    """Return a mapping from expansion strings to their evaluated probabilities."""
    probabilities = [exp_prob(expansion) for expansion in expansions]
    prob_dist = prob_distribution(probabilities, nonterminal)

    return {
        exp_string(expansions[i]): prob_dist[i] for i in range(len(expansions))
    }


def nonterminals(expansion: str | tuple[Any, ...]) -> list[str]:
    """Extract all non-terminal symbols present within an expansion string."""
    if isinstance(expansion, tuple):
        expansion = expansion[0]
    return RE_NONTERMINAL.findall(expansion)


def def_used_nonterminals(
    grammar: Grammar, start_symbol: str = START_SYMBOL
) -> tuple[set[str], set[str]]:
    """Return defined and used non-terminals in the grammar."""
    defined_nonterminals: set[str] = set()
    used_nonterminals: set[str] = {start_symbol}
    for defined_symbol, expansions in grammar.items():
        defined_nonterminals.add(defined_symbol)
        for expansion in expansions:
            for used_symbol in nonterminals(expansion):
                used_nonterminals.add(used_symbol)
    return defined_nonterminals, used_nonterminals


def reachable_nonterminals(
    grammar: Grammar, start_symbol: str = START_SYMBOL
) -> set[str]:
    """Compute all reachable non-terminal symbols starting from `start_symbol`."""
    reachable: set[str] = set()

    def _reach(symbol: str) -> None:
        reachable.add(symbol)
        if symbol in grammar:
            for expansion in grammar[symbol]:
                for child in nonterminals(expansion):
                    if child not in reachable:
                        _reach(child)

    _reach(start_symbol)
    return reachable


def is_valid_grammar(
    grammar: Grammar,
    start_symbol: str = START_SYMBOL,
    supported_opts: set[str] | None = None,
) -> bool:
    """Validate that all non-terminals are defined, used, and reachable."""
    defined_nonterminals, used_nonterminals = def_used_nonterminals(
        grammar, start_symbol
    )
    if START_SYMBOL in grammar:
        used_nonterminals.add(START_SYMBOL)
    unreachable = defined_nonterminals - reachable_nonterminals(grammar, start_symbol)
    if START_SYMBOL in grammar and start_symbol != START_SYMBOL:
        unreachable = unreachable - reachable_nonterminals(grammar, START_SYMBOL)
    return used_nonterminals == defined_nonterminals and len(unreachable) == 0


def is_valid_probabilistic_grammar(
    grammar: Grammar, start_symbol: str = START_SYMBOL
) -> bool:
    """Validate that the grammar is structurally valid and probabilities normalize properly."""
    if not is_valid_grammar(grammar, start_symbol):
        return False

    for nonterminal, expansions in grammar.items():
        _ = exp_probabilities(expansions, nonterminal)

    return True


def all_terminals(tree: Any) -> str:
    """Extract and concatenate all terminal leaves from a derivation tree or node tuple."""
    symbol, children, *_ = tree
    if children is None or len(children) == 0:
        return symbol

    return "".join(all_terminals(c) for c in children)


def expansion_key(symbol: str, expansion: Any) -> str:
    """Convert (symbol, expansion) into a unique lookup key 'SYMBOL -> EXPRESSION'."""
    if isinstance(expansion, tuple):
        expansion, _ = expansion

    if isinstance(expansion, list) and not expansion:
        expansion = ""

    if not isinstance(expansion, str):
        expansion = all_terminals((symbol, expansion))

    assert isinstance(expansion, str)
    return f"{symbol} -> {expansion}"


def extend_grammar(grammar: Grammar, extension: Grammar | None = None) -> Grammar:
    """Return a deep copy of grammar extended with optional extra rules."""
    new_grammar = copy.deepcopy(grammar)
    if extension:
        new_grammar.update(extension)
    return new_grammar
