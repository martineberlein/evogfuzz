from __future__ import annotations

import math
import string

from evogfuzz.input import Input
from evogfuzz.oracle import OracleResult
from evogfuzz.types import Grammar

__all__ = [
    "arith_eval",
    "calculator_oracle",
    "calculator_grammar",
    "calculator_grammar_with_zero",
    "calculator_initial_inputs",
]


def arith_eval(inp: Input | str) -> float:
    """Evaluate an arithmetic expression string with safe mathematical functions."""
    return eval(  # noqa: S307
        str(inp),
        {"__builtins__": None},
        {"sqrt": math.sqrt, "sin": math.sin, "cos": math.cos, "tan": math.tan},
    )


def calculator_oracle(
    inp: Input | str,
) -> tuple[OracleResult, Exception | None]:
    """Oracle evaluating mathematical inputs, classifying ValueError (domain error) as FAILING."""
    try:
        arith_eval(inp)
    except ValueError as e:
        return OracleResult.FAILING, e
    except Exception:
        return OracleResult.UNDEFINED, None
    return OracleResult.PASSING, None


calculator_grammar: Grammar = {
    "<start>": ["<arith_expr>"],
    "<arith_expr>": ["<function>(<number>)"],
    "<function>": ["sqrt", "sin", "cos", "tan"],
    "<number>": ["<maybe_minus><one_nine><maybe_digits><maybe_frac>"],
    "<maybe_minus>": ["", "-"],
    "<maybe_frac>": ["", ".<digits>"],
    "<one_nine>": [str(num) for num in range(1, 10)],
    "<digit>": list(string.digits),
    "<maybe_digits>": ["", "<digits>"],
    "<digits>": ["<digit>", "<digit><digits>"],
}


calculator_grammar_with_zero: Grammar = {
    "<start>": ["<arith_expr>"],
    "<arith_expr>": ["<function>(<number>)"],
    "<function>": ["sqrt", "sin", "cos", "tan"],
    "<number>": ["<maybe_minus><one_nine><maybe_digits><maybe_frac>", "-0", "0"],
    "<maybe_minus>": ["", "-"],
    "<maybe_frac>": ["", ".<digits>"],
    "<one_nine>": [str(num) for num in range(1, 10)],
    "<digit>": list(string.digits),
    "<maybe_digits>": ["", "<digits>"],
    "<digits>": ["<digit>", "<digit><digits>"],
}


calculator_initial_inputs: list[str] = [
    "sqrt(-900)",
    "sqrt(-10)",
    "sqrt(1)",
    "sin(-900)",
    "sqrt(2)",
    "cos(10)",
]
