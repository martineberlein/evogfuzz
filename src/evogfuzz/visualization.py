from __future__ import annotations

from typing import Any
import matplotlib.pyplot as plt

from evogfuzz.types import Grammar, GrammarType

__all__ = ["parse_prob_grammars", "plot"]


def _initialize(grammar: Grammar) -> dict[str, list[float]]:
    """Create an empty dictionary of grammar features.

    Args:
        grammar: The baseline grammar.

    Returns:
        Mapping from feature string (e.g. '<rule>-><child>') to an empty list.
    """
    probabilities: dict[str, list[float]] = {}
    for rule, expansions in grammar.items():
        for child in expansions:
            feature = f"{rule}->{child[0]}"
            probabilities[feature] = []
    return probabilities


def parse_prob_grammars(grammar_list: list[Grammar]) -> dict[str, list[float]]:
    """Extract individual rule probabilities across a sequence of probabilistic grammars.

    Args:
        grammar_list: A list of probabilistic grammars.

    Returns:
        Dictionary mapping each grammar rule derivation to a list of its probabilities over time.
    """
    probabilities = _initialize(grammar_list[0])

    for grammar in grammar_list:
        for rule, expansions in grammar.items():
            for child in expansions:
                feature = f"{rule}->{child[0]}"
                prob_list = probabilities[feature]

                assert isinstance(child, tuple), "Expected a probabilistic grammar"

                prob = child[1].get("prob")
                if prob is None:
                    prob_list.append(1.0)
                else:
                    prob_list.append(float(prob))
                probabilities[feature] = prob_list

    return probabilities


def _mathlib_plot(x_values: list[int], feature_probabilities: dict[str, list[float]]) -> None:
    """Plot tracked grammar feature probabilities."""
    _, ax = plt.subplots(1)
    feature_disp = ["<function>->cos", "<function>->sqrt", "<maybe_minus>->-"]

    for feature in feature_disp:
        if feature in feature_probabilities:
            ax.plot(x_values, feature_probabilities[feature], label=feature)


def plot(
    grammar_list: list[tuple[Grammar, GrammarType, float]] | list[Grammar],
) -> None:
    """Plot the evolution of rule probabilities across grammar generations.

    Args:
        grammar_list: Sequence of grammars or tuples of (grammar, type, fitness).
    """
    extracted_grammars: list[Grammar]
    if grammar_list and isinstance(grammar_list[0], tuple):
        extracted_grammars = [item[0] for item in grammar_list]  # type: ignore[union-attr]
    else:
        extracted_grammars = grammar_list  # type: ignore[assignment]

    x_values = list(range(len(extracted_grammars)))
    prob_dict = parse_prob_grammars(extracted_grammars)
    _mathlib_plot(x_values, prob_dict)
