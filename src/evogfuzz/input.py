from __future__ import annotations

from collections.abc import Iterator
from typing import Any

from evogfuzz.derivation_tree import DerivationTree
from evogfuzz.oracle import OracleResult

__all__ = ["Input"]


class Input:
    """Represents a test input comprising a derivation tree, oracle result, and fitness score.

    This class encapsulates a test case for evolutionary fuzzing, associating
    the underlying derivation tree with its execution outcome (oracle) and
    evaluated fitness score. Supports 2-tuple unpacking ``(tree, oracle)``.
    """

    __slots__ = ("_tree", "_oracle", "_fitness")
    __match_args__ = ("tree", "oracle")

    def __init__(
        self,
        tree: DerivationTree,
        oracle: OracleResult | None = None,
    ) -> None:
        """Initialize a test input.

        Args:
            tree: The derivation tree representing the test input.
            oracle: The evaluation result of the input, if already executed.
        """
        self._tree: DerivationTree = tree
        self._oracle: OracleResult | None = oracle
        self._fitness: float = 0.0

    @property
    def tree(self) -> DerivationTree:
        """The derivation tree representing this input."""
        return self._tree

    @property
    def oracle(self) -> OracleResult | None:
        """The oracle result for this input, or None if unexecuted."""
        return self._oracle

    @oracle.setter
    def oracle(self, oracle_: OracleResult | None) -> None:
        self._oracle = oracle_

    @property
    def fitness(self) -> float:
        """The evolutionary fitness score assigned to this input."""
        return self._fitness

    @fitness.setter
    def fitness(self, fitness_: float) -> None:
        self._fitness = fitness_

    def update_oracle(self, oracle_: OracleResult | None) -> Input:
        """Update the oracle result and return self for method chaining.

        Args:
            oracle_: The new oracle result.

        Returns:
            Self instance.
        """
        self._oracle = oracle_
        return self

    def __repr__(self) -> str:
        return f"Input({self._tree!r}, {self._oracle!r})"

    def __str__(self) -> str:
        return str(self._tree)

    def __hash__(self) -> int:
        return self._tree.structural_hash()

    def __eq__(self, other: object) -> bool:
        return isinstance(other, Input) and hash(self) == hash(other)

    def __iter__(self) -> Iterator[DerivationTree | OracleResult | None]:
        """Allow tuple unpacking: ``tree, oracle = inp``."""
        yield self._tree
        yield self._oracle

    def __getitem__(self, item: int) -> DerivationTree | OracleResult | None:
        """Support indexing: ``inp[0]`` for tree, ``inp[1]`` for oracle."""
        if item in (0, -2):
            return self._tree
        if item in (1, -1):
            return self._oracle
        raise IndexError(f"{type(self).__name__} index out of range: {item}")

    def __len__(self) -> int:
        return 2
