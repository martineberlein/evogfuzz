import copy
import logging
from typing import Set, List

from debugging_framework.types import Grammar
from debugging_framework.fuzzingbook.grammar import is_nonterminal, is_valid_grammar
from debugging_framework.fuzzingbook.helper import tree_to_string
from isla.parser import EarleyParser

from evogfuzz.input import Input


def extend_grammar(derivation_tree, grammar, original_grammar, recursive: bool = True):
    (node, children) = derivation_tree

    if is_nonterminal(node):
        assert node in grammar
        word = tree_to_string(derivation_tree)

        # Only add to grammar if not already existent
        if word not in grammar[node]:
            if recursive:
                grammar[node].append(word)
            elif not recursive and grammar[node] == original_grammar[node]:
                grammar[node].append(word)

    for child in children:
        extend_grammar(child, grammar, original_grammar, recursive)


def get_transformed_grammar(
    test_inputs: Set[Input], grammar: Grammar, recursive: bool = True
) -> Grammar:
    # copy of the grammar
    transformed_grammar = copy.deepcopy(grammar)

    for inp in test_inputs:
        extend_grammar(inp.tree, transformed_grammar, grammar, recursive=recursive)

    # Add dummy rule
    transformed_grammar = _add_dummy_rule(transformed_grammar)

    if is_valid_grammar(transformed_grammar):
        return transformed_grammar
    else:
        logging.info("Transformed Grammar is not valid! Using provided grammar!")
        return grammar


def get_transformed_grammar_from_strings(
    test_inputs: List[str], grammar: Grammar, recursive: bool = True
) -> Grammar:
    # copy of the grammar
    transformed_grammar = copy.deepcopy(grammar)

    parser = EarleyParser(grammar)
    for inp in test_inputs:
        for tree in parser.parse(inp):
            extend_grammar(
                tree, transformed_grammar, recursive=recursive, original_grammar=grammar
            )

    # Add dummy rule
    transformed_grammar = _add_dummy_rule(transformed_grammar)

    if is_valid_grammar(transformed_grammar):
        return transformed_grammar
    else:
        logging.info("Transformed Grammar is not valid! Using provided grammar!")
        return grammar


def _add_dummy_rule(grammar: Grammar):
    tmp = grammar["<start>"]
    grammar["<start>"] = ["<rules>"]
    grammar["<rules>"] = tmp

    return grammar
