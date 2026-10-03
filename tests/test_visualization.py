import unittest

from tests.calculator import (
    calculator_grammar as grammar,
    calculator_oracle as oracle,
    calculator_initial_inputs as initial_inputs,
)

from evogfuzz import EvoGFuzz
from evogfuzz.visualization import parse_prob_grammars, plot

ITERATIONS = 3


class TestEvoGFuzzVisualization(unittest.TestCase):
    def setUp(self) -> None:
        self.evogfuzz = EvoGFuzz(
            grammar=grammar, oracle=oracle, inputs=initial_inputs, iterations=ITERATIONS
        )
        self.evogfuzz.fuzz()
        self.all_prob_grammars = self.evogfuzz._probabilistic_grammars
        assert len(self.all_prob_grammars) == ITERATIONS * 2 + 1

    def test_parse_prob_grammars(self):
        grammar_list = [x[0] for x in self.all_prob_grammars]
        res = parse_prob_grammars(grammar_list)
        expected = {
            "<start>-><arith_expr>",
            "<arith_expr>-><function>(<number>)",
            "<function>->sqrt",
            "<function>->sin",
            "<function>->cos",
            "<function>->tan",
            "<number>-><maybe_minus><one_nine><maybe_digits><maybe_frac>",
            "<maybe_minus>->",
            "<maybe_minus>->-",
            "<one_nine>->1",
            "<one_nine>->2",
            "<one_nine>->3",
            "<one_nine>->4",
            "<one_nine>->5",
            "<one_nine>->6",
            "<one_nine>->7",
            "<one_nine>->8",
            "<one_nine>->9",
            "<digit>->0",
            "<digit>->1",
            "<digit>->2",
            "<digit>->3",
            "<digit>->4",
            "<digit>->5",
            "<digit>->6",
            "<digit>->7",
            "<digit>->8",
            "<digit>->9",
            "<maybe_digits>->",
            "<maybe_digits>-><digits>",
            "<digits>-><digit>",
            "<digits>-><digit><digits>",
            "<maybe_frac>->",
            "<maybe_frac>->.<digits>",
        }
        actual = set(res.keys())
        self.assertEqual(expected, actual)

        for expansion_key in res.keys():
            assert len(res[expansion_key]) == ITERATIONS * 2 + 1

    def test_visualization_plot(self):
        plot(self.all_prob_grammars)
