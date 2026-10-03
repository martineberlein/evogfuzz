from __future__ import annotations

import itertools
from collections.abc import Collection, Generator, Iterable
from typing import Any

from evogfuzz.derivation_tree import RE_NONTERMINAL, is_nonterminal

__all__ = [
    "Parser",
    "EarleyParser",
    "START_SYMBOL",
    "tree_to_string",
    "ParseTree",
]

START_SYMBOL = "<start>"

Grammar = dict[str, list[Any]]
ParseTree = tuple[str, list[Any] | None]
CanonicalGrammar = dict[str, list[list[str]]]


def tree_to_string(tree: Any) -> str:
    """Flatten a parse tree tuple or DerivationTree into its terminal string."""
    symbol, children, *_ = tree
    if children:
        return "".join(tree_to_string(c) for c in children)
    return "" if is_nonterminal(symbol) else symbol


def single_char_tokens(grammar: Grammar) -> dict[str, list[list[Collection[str]]]]:
    """Tokenize terminal expressions into single characters where appropriate."""
    g_: dict[str, list[list[Collection[str]]]] = {}
    for key, rules in grammar.items():
        rules_ = []
        for rule in rules:
            rule_ = []
            for token in rule:
                if token in grammar:
                    rule_.append(token)
                else:
                    rule_.extend(token)
            rules_.append(rule_)
        g_[key] = rules_
    return g_


def canonical(grammar: Grammar) -> CanonicalGrammar:
    """Convert grammar strings into token sequences separated by non-terminals."""
    def split(expansion: str) -> list[str]:
        return [token for token in RE_NONTERMINAL.split(expansion) if token]

    return {
        k: [split(expression) for expression in alternatives]
        for k, alternatives in grammar.items()
    }


def non_canonical(grammar: Any) -> dict[str, list[str]]:
    """Convert token sequence grammar back into raw strings."""
    new_grammar: dict[str, list[str]] = {}
    for k, rules in grammar.items():
        new_grammar[k] = ["".join(rule) for rule in rules]
    return new_grammar


class Parser:
    """Base class for grammar-based parsing."""

    def __init__(self, grammar: Grammar, **kwargs: Any) -> None:
        self._start_symbol: str = kwargs.get("start_symbol", START_SYMBOL)
        self.log: bool = kwargs.get("log", False)
        self.tokens: set[str] = kwargs.get("tokens", set())
        self.coalesce_tokens: bool = kwargs.get("coalesce", True)
        canonical_grammar = kwargs.get("canonical", False)

        if canonical_grammar:
            self.cgrammar = single_char_tokens(grammar)
            self._grammar = non_canonical(grammar)
        else:
            self._grammar = dict(grammar)
            self.cgrammar = single_char_tokens(canonical(grammar))

        if len(grammar.get(self._start_symbol, [])) != 1:
            self.cgrammar["<>"] = [[self._start_symbol]]

    def grammar(self) -> Grammar:
        return self._grammar

    def start_symbol(self) -> str:
        return self._start_symbol

    def parse_prefix(self, text: str) -> tuple[int, Iterable[ParseTree]]:
        raise NotImplementedError

    def parse(self, text: str) -> list[ParseTree]:
        cursor, forest = self.parse_prefix(text)
        if cursor < len(text):
            raise SyntaxError(f"at {text[cursor:]!r}")
        return [self.prune_tree(tree) for tree in forest]

    def parse_on(self, text: str, start_symbol: str) -> Generator[ParseTree, None, None]:
        old_start = self._start_symbol
        try:
            self._start_symbol = start_symbol
            yield from self.parse(text)
        finally:
            self._start_symbol = old_start

    def coalesce(self, children: list[ParseTree]) -> list[ParseTree]:
        last = ""
        new_lst: list[ParseTree] = []
        for cn, cc in children:
            if cn not in self._grammar:
                last += cn
            else:
                if last:
                    new_lst.append((last, []))
                    last = ""
                new_lst.append((cn, cc))
        if last:
            new_lst.append((last, []))
        return new_lst

    def prune_tree(self, tree: ParseTree) -> ParseTree:
        name, children = tree
        if name == "<>":
            assert children is not None and len(children) == 1
            return self.prune_tree(children[0])
        if self.coalesce_tokens and children is not None:
            children = self.coalesce(children)
        if name in self.tokens:
            return (name, [(tree_to_string(tree), [])])
        return (name, [self.prune_tree(c) for c in (children or [])])


class Column:
    """Represents a column in an Earley parse chart."""

    __slots__ = ("index", "letter", "states", "_unique")

    def __init__(self, index: int, letter: str | None) -> None:
        self.index: int = index
        self.letter: str | None = letter
        self.states: list[State] = []
        self._unique: dict[State, State] = {}

    def __str__(self) -> str:
        finished_states = "\n".join(str(s) for s in self.states if s.finished())
        return f"{self.letter} chart[{self.index}]\n{finished_states}"

    def add(self, state: State) -> State:
        if state in self._unique:
            return self._unique[state]
        self._unique[state] = state
        self.states.append(state)
        state.e_col = self
        return self._unique[state]


class Item:
    """Earley item representing a production rule and dot position."""

    __slots__ = ("name", "expr", "dot")

    def __init__(self, name: str, expr: tuple[Any, ...], dot: int) -> None:
        self.name: str = name
        self.expr: tuple[Any, ...] = expr
        self.dot: int = dot

    def finished(self) -> bool:
        return self.dot >= len(self.expr)

    def advance(self) -> Item:
        return Item(self.name, self.expr, self.dot + 1)

    def at_dot(self) -> str | None:
        return self.expr[self.dot] if self.dot < len(self.expr) else None


class State(Item):
    """Earley state connecting an item with its start and end columns."""

    __slots__ = ("s_col", "e_col")

    def __init__(
        self,
        name: str,
        expr: tuple[Any, ...],
        dot: int,
        s_col: Column,
        e_col: Column | None = None,
    ) -> None:
        super().__init__(name, expr, dot)
        self.s_col: Column = s_col
        self.e_col: Column | None = e_col

    def __str__(self) -> str:
        def idx(var: Column | None) -> int:
            return var.index if var else -1

        lhs = " ".join(str(p) for p in [*self.expr[: self.dot], "|", *self.expr[self.dot :]])
        return f"{self.name}:= {lhs}({idx(self.s_col)},{idx(self.e_col)})"

    def copy(self) -> State:
        return State(self.name, self.expr, self.dot, self.s_col, self.e_col)

    def _t(self) -> tuple[str, tuple[Any, ...], int, int]:
        return (self.name, self.expr, self.dot, self.s_col.index)

    def __hash__(self) -> int:
        return hash(self._t())

    def __eq__(self, other: object) -> bool:
        if not isinstance(other, State):
            return False
        return self._t() == other._t()

    def advance(self) -> State:
        return State(self.name, self.expr, self.dot + 1, self.s_col)


def fixpoint(f: Any) -> Any:
    def helper(arg: Any) -> Any:
        while True:
            sarg = str(arg)
            arg_ = f(arg)
            if str(arg_) == sarg:
                return arg
            arg = arg_

    return helper


def rules(grammar: Grammar) -> list[tuple[str, Any]]:
    return [(key, choice) for key, choices in grammar.items() for choice in choices]


def nullable_expr(expr: Any, nullables: set[str]) -> bool:
    return all(token in nullables for token in expr)


EPSILON = ""


def nullable(grammar: Any) -> set[str]:
    productions = rules(grammar)

    @fixpoint
    def nullable_(nullables: set[str]) -> set[str]:
        for a, expr in productions:
            if nullable_expr(expr, nullables):
                nullables |= {a}
        return nullables

    return nullable_({EPSILON})


class EarleyParser(Parser):
    """Earley algorithm context-free grammar parser."""

    def __init__(self, grammar: Grammar, **kwargs: Any) -> None:
        super().__init__(grammar, **kwargs)
        self.epsilon: set[str] = nullable(self.cgrammar)
        self.table: list[Column] = []

    def chart_parse(self, words: str, start: str) -> list[Column]:
        alt = tuple(*self.cgrammar[start])
        chart = [Column(i, tok) for i, tok in enumerate([None, *words])]
        chart[0].add(State(start, alt, 0, chart[0]))
        return self.fill_chart(chart)

    def scan(self, col: Column, state: State, letter: str | None) -> None:
        if letter == col.letter:
            col.add(state.advance())

    def complete(self, col: Column, state: State) -> None:
        self.earley_complete(col, state)

    def earley_complete(self, col: Column, state: State) -> None:
        parent_states = [st for st in state.s_col.states if st.at_dot() == state.name]
        for st in parent_states:
            col.add(st.advance())

    def fill_chart(self, chart: list[Column]) -> list[Column]:
        for i, col in enumerate(chart):
            for state in col.states:
                if state.finished():
                    self.complete(col, state)
                else:
                    sym = state.at_dot()
                    if sym in self.cgrammar:
                        self.predict(col, sym, state)
                    else:
                        if i + 1 >= len(chart):
                            continue
                        self.scan(chart[i + 1], state, sym)
            if self.log:
                print(col, "\n")
        return chart

    def parse_prefix(self, text: str) -> tuple[int, list[State]]:
        self.table = self.chart_parse(text, self.start_symbol())
        for col in reversed(self.table):
            states = [st for st in col.states if st.name == self.start_symbol()]
            if states:
                return col.index, states
        return -1, []

    def parse(self, text: str) -> Generator[ParseTree, None, None]:
        cursor, states = self.parse_prefix(text)
        start = next((s for s in states if s.finished()), None)

        if cursor < len(text) or not start:
            raise SyntaxError(f"at {text[cursor:]!r}")

        forest = self.parse_forest(self.table, start)
        for tree in self.extract_trees(forest):
            yield self.prune_tree(tree)

    def parse_paths(
        self, named_expr: Any, chart: list[Column], frm: int, til: int
    ) -> list[Any]:
        def paths(state: Any, start: int, k: str, e: Any) -> list[Any]:
            if not e:
                return [[(state, k)]] if start == frm else []
            return [
                [(state, k)] + r for r in self.parse_paths(e, chart, frm, start)
            ]

        *expr, var = named_expr
        if var not in self.cgrammar:
            starts = (
                [(var, til - len(var), "t")]
                if til > 0 and chart[til].letter == var
                else []
            )
        else:
            starts = [
                (s, s.s_col.index, "n")
                for s in chart[til].states
                if s.finished() and s.name == var
            ]

        return [p for s, start, k in starts for p in paths(s, start, k, expr)]

    def forest(self, s: Any, kind: str, chart: list[Column]) -> Any:
        return self.parse_forest(chart, s) if kind == "n" else (s, [])

    def parse_forest(self, chart: list[Column], state: State) -> Any:
        pathexprs = (
            self.parse_paths(state.expr, chart, state.s_col.index, state.e_col.index)
            if state.expr
            else []
        )
        return state.name, [
            [(v, k, chart) for v, k in reversed(pathexpr)] for pathexpr in pathexprs
        ]

    def extract_trees(self, forest_node: Any) -> Generator[ParseTree, None, None]:
        name, paths = forest_node
        if not paths:
            yield (name, [])

        for path in paths:
            ptrees = [self.extract_trees(self.forest(*p)) for p in path]
            for p in itertools.product(*ptrees):
                yield (name, list(p))

    def predict(self, col: Column, sym: str, state: State) -> None:
        for alt in self.cgrammar[sym]:
            col.add(State(sym, tuple(alt), 0, col))
        if sym in self.epsilon:
            col.add(state.advance())
