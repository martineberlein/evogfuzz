import sys
import unittest

from tests.calculator import (
    calculator_grammar as grammar,
    calculator_initial_inputs as initial_inputs,
    calculator_oracle as oracle,
)
from evogfuzz.oracle import OracleResult

from evogfuzz.fitness_functions import fitness_function_failure as fitness_function
from evogfuzz.evogfuzz_class import EvoGFuzz


class TestEvoGFuzz(unittest.TestCase):
    def test_python_version(self):
        self.assertTrue(
            sys.version_info >= (3, 10),
            "Python version does not match the minimum requirement!",
        )

    def test_evogfuzz_initialize(self):
        evogfuzz = EvoGFuzz(
            grammar=grammar,
            oracle=oracle,
            inputs=["sqrt(-900)", "cos(12)"],
            fitness_function=fitness_function,
        )
        evogfuzz._setup()
        self.assertEqual(len(evogfuzz.report.get_all_failing_inputs()), 1)

    def test_evogfuzz_found_exceptions(self):
        evogfuzz = EvoGFuzz(
            grammar=grammar,
            oracle=oracle,
            inputs=initial_inputs,
            fitness_function=fitness_function,
        )
        found_exceptions = evogfuzz.fuzz()
        self.assertTrue(
            all(
                [True for inp in found_exceptions if inp.oracle == OracleResult.FAILING]
            )
        )


if __name__ == "__main__":
    unittest.main()
