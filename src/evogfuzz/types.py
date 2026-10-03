from __future__ import annotations

from collections.abc import Callable
from enum import Enum
from typing import Any

from evogfuzz.oracle import OracleResult

__all__ = [
    "Scenario",
    "GrammarType",
    "Option",
    "Expansion",
    "Grammar",
    "OracleResultType",
    "OracleType",
    "BatchOracleType",
]


class Scenario(Enum):
    FUZZING = "Fuzzing"
    GENERATOR = "Generator"

    def __str__(self) -> str:
        return self.value


class GrammarType(Enum):
    MUTATED = "mutated"
    LEARNED = "learned"

    def __str__(self) -> str:
        return self.value


Option = dict[str, Any]
Expansion = str | tuple[str, Option]
Grammar = dict[str, list[Expansion]]

OracleResultType = tuple[OracleResult, Exception | None]
OracleType = Callable[[Any], OracleResultType]
BatchOracleType = Callable[[Any], list[OracleResultType]]
