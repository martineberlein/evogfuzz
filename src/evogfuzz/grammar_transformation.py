from __future__ import annotations

import copy
from typing import Any

from evogfuzz.derivation_tree import DerivationTree, is_nonterminal
from evogfuzz.grammar import is_valid_grammar, tree_to_string
from evogfuzz.input import Input
from evogfuzz.parser import EarleyParser
from evogfuzz.types import Grammar

__all__ = [
    "extend_grammar",
    "get_transformed_grammar",
    "get_transformed_grammar_from_strings",
]


def extend_grammar(
    derivation_tree: DerivationTree | tuple[str, Any],
    grammar: Grammar,
    original_grammar: Grammar,
    recursive: bool = True,
) -> None:
    """Recursively extend a grammar with concrete substrings derived by a derivation tree.

    Args:
        derivation_tree: A DerivationTree or 2-tuple (node, children).
        grammar: The grammar to extend in-place.
        original_grammar: The base reference grammar.
        recursive: Whether to extend non-terminals recursively.
    """
    node, children = derivation_tree

    if is_nonterminal(node):
        assert node in grammar
        word = tree_to_string(derivation_tree)

        # Only add to grammar if not already existent
        if word not in grammar[node]:
            if recursive:
                grammar[node].append(word)
            elif not recursive and grammar[node] == original_grammar[node]:
                grammar[node].append(word)

    if children:
        for child in children:
            extend_grammar(child, grammar, original_grammar, recursive)


def _add_dummy_rule(grammar: Grammar) -> Grammar:
    """Wrap <start> with a dummy indirection rule <rules>."""
    tmp = grammar["<start>"]
    grammar["<start>"] = ["<rules>"]
    grammar["<rules>"] = tmp
    return grammar


def get_transformed_grammar(
    test_inputs: set[Input],
    grammar: Grammar,
    recursive: bool = True,
) -> Grammar:
    """Transform grammar by adding sub-trees extracted from a set of inputs.

    Args:
        test_inputs: Set of failure-inducing Input instances.
        grammar: Original base grammar.
        recursive: Whether to extract recursively.

    Returns:
        The transformed Grammar.
    """
    transformed_grammar = copy.deepcopy(grammar)

    for inp in test_inputs:
        extend_grammar(inp.tree, transformed_grammar, grammar, recursive=recursive)

    transformed_grammar = _add_dummy_rule(transformed_grammar)
    assert is_valid_grammar(transformed_grammar)
    return transformed_grammar


def get_transformed_grammar_from_strings(
    test_inputs: list[str],
    grammar: Grammar,
    recursive: bool = True,
) -> Grammar:
    """Transform grammar by parsing input strings and adding their derivation subtrees.

    Args:
        test_inputs: List of failure-inducing string inputs.
        grammar: Original base grammar.
        recursive: Whether to extract recursively.

    Returns:
        The transformed Grammar.
    """
    transformed_grammar = copy.deepcopy(grammar)

    parser = EarleyParser(grammar)
    for inp in test_inputs:
        for tree in parser.parse(inp):
            extend_grammar(
                tree,
                transformed_grammar,
                recursive=recursive,
                original_grammar=grammar,
            )

    transformed_grammar = _add_dummy_rule(transformed_grammar)
    assert is_valid_grammar(transformed_grammar)
    return transformed_grammar
