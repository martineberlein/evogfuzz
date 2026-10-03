from __future__ import annotations

from evogfuzz.input import Input
from evogfuzz.oracle import OracleResult

__all__ = ["fitness_function_failure", "get_fitness"]


def fitness_function_failure(test_input: Input) -> float:
    """Evaluate fitness of a test input based on whether it triggered a failure.

    Args:
        test_input: The test input to evaluate.

    Returns:
        1.0 if the input triggered a failure, 0.0 otherwise.
    """
    return float(get_fitness(test_input))


def get_fitness(test_input: Input) -> int:
    """Return 1 if the input caused a failure, 0 otherwise.

    Args:
        test_input: The test input to evaluate.

    Returns:
        1 if failing, 0 otherwise.
    """
    return 1 if test_input.oracle is OracleResult.FAILING else 0
