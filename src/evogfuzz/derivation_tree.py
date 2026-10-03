from __future__ import annotations

import re
from collections.abc import Iterator, Sequence
from typing import Any

__all__ = ["DerivationTree", "is_nonterminal", "RE_NONTERMINAL"]

RE_NONTERMINAL: re.Pattern[str] = re.compile(r"(<[^<> ]*>)")


def is_nonterminal(symbol: str) -> bool:
    """Return True if the given symbol is a grammar non-terminal (e.g. '<expr>').

    Args:
        symbol: The string token to check.

    Returns:
        True if the symbol matches the non-terminal pattern, False otherwise.
    """
    return bool(RE_NONTERMINAL.match(symbol))


class DerivationTree:
    """Lightweight, immutable derivation tree representation.

    Represents a node in a syntax derivation tree containing a grammar symbol
    (terminal or non-terminal) and an optional sequence of child derivation trees.
    Provides complete compatibility with 2-tuple unpacking ``(node, children)``
    and indexing from *The Fuzzing Book*.
    """

    __slots__ = ("_value", "_children", "_structural_hash")
    __match_args__ = ("value", "children")

    def __init__(
        self,
        value: str,
        children: Sequence[DerivationTree] | None = None,
    ) -> None:
        """Initialize a DerivationTree node.

        Args:
            value: The grammar symbol or token string.
            children: Optional sequence of child DerivationTree instances.
        """
        self._value: str = value
        self._children: tuple[DerivationTree, ...] | None = (
            tuple(children) if children is not None else None
        )
        self._structural_hash: int | None = None

    @property
    def value(self) -> str:
        """The symbol or token string stored at this node."""
        return self._value

    @property
    def children(self) -> tuple[DerivationTree, ...] | None:
        """Tuple of child derivation trees, or None if this node is a leaf."""
        return self._children

    @classmethod
    def from_parse_tree(cls, tree: Any) -> DerivationTree:
        """Convert a parse tree tuple ``(symbol, children)`` into a DerivationTree.

        Args:
            tree: Either an existing DerivationTree or a parse tree tuple
                in the format ``(symbol, children)``.

        Returns:
            A DerivationTree instance representing the parse tree.
        """
        if isinstance(tree, cls):
            return tree
        node = tree[0]
        children = tree[1] if len(tree) > 1 else None
        if children is not None:
            children = tuple(cls.from_parse_tree(c) for c in children)
        return cls(node, children)

    def to_parse_tree(self) -> tuple[str, list[Any] | None]:
        """Convert this DerivationTree back into a parse tree tuple.

        Returns:
            A 2-tuple ``(symbol, children_list)`` matching the format used
            by *The Fuzzing Book* parsers.
        """
        if self._children is None:
            return (self._value, None)
        return (self._value, [c.to_parse_tree() for c in self._children])

    def to_string(self) -> str:
        """Derive and return the terminal string represented by this tree.

        Returns:
            The concatenated string of terminal leaves.
        """
        if self._children:
            return "".join(child.to_string() for child in self._children)
        return "" if is_nonterminal(self._value) else self._value

    def structural_hash(self) -> int:
        """Compute or return the cached structural hash of the tree.

        Returns:
            An integer hash computed recursively from the node value and child hashes.
        """
        if self._structural_hash is None:
            if self._children is None:
                self._structural_hash = hash(self._value)
            else:
                self._structural_hash = hash(
                    (self._value, tuple(c.structural_hash() for c in self._children))
                )
        return self._structural_hash

    def __hash__(self) -> int:
        return self.structural_hash()

    def __eq__(self, other: object) -> bool:
        if not isinstance(other, DerivationTree):
            return False
        return self._value == other._value and self._children == other._children

    def __iter__(self) -> Iterator[str | list[DerivationTree] | None]:
        """Allow tuple unpacking: ``node, children = tree``.

        Yields:
            The string node value followed by the list of children (or None).
        """
        yield self._value
        yield None if self._children is None else list(self._children)

    def __getitem__(self, item: int) -> str | list[DerivationTree] | None:
        """Support positional indexing like a 2-tuple.

        Args:
            item: 0 or -2 for node value; 1 or -1 for child list.

        Returns:
            The node value or child list.

        Raises:
            IndexError: If item is out of the valid range [-2, 1].
        """
        if item in (0, -2):
            return self._value
        if item in (1, -1):
            return None if self._children is None else list(self._children)
        raise IndexError(f"{type(self).__name__} index out of range: {item}")

    def __len__(self) -> int:
        return 2

    def __str__(self) -> str:
        return self.to_string()

    def __repr__(self) -> str:
        return f"DerivationTree({self._value!r}, {self._children!r})"
