from __future__ import annotations

from enum import Enum

__all__ = ["OracleResult"]


class OracleResult(Enum):
    """An enumeration representing possible results of an oracle evaluation.

    Attributes:
        FAILING: The test input caused a failure or unexpected exception.
        PASSING: The test input executed without failure.
        UNDEFINED: Inconclusive, unhandled, or timeout outcome.
    """

    FAILING = "FAILING"
    PASSING = "PASSING"
    UNDEFINED = "UNDEFINED"

    def __str__(self) -> str:
        return self.value

    def is_failing(self) -> bool:
        """Return True if this result represents a failure."""
        return self is OracleResult.FAILING

    def is_undefined(self) -> bool:
        """Return True if this result is undefined or inconclusive."""
        return self is OracleResult.UNDEFINED
