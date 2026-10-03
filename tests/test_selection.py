import unittest

from evogfuzz.fuzzer import GrammarFuzzer
from evogfuzz.derivation_tree import DerivationTree
from tests.calculator import calculator_grammar as grammar

from evogfuzz.input import Input
from evogfuzz.tournament_selection import Tournament


class TournamentSelection(unittest.TestCase):
    def test_selection(self):
        fuzzer = GrammarFuzzer(grammar)
        test_inputs = set()
        for idx, _ in enumerate(range(100)):
            inp = Input(DerivationTree.from_parse_tree(fuzzer.fuzz_tree()))
            inp.fitness = idx
            test_inputs.add(inp)
        for inp in test_inputs:
            print(inp, inp.oracle, inp.fitness)

        selected = Tournament(test_inputs).select_fittest_individuals()
        print("______")
        for inp in selected:
            print(inp, inp.oracle, inp.fitness)

    def test_range_selection(self):
        initial = [0, 1, 9, 16, 25, 36, 64]
        selected = initial[:100]

        try:
            initial = []
            fittest = set()
            fi = sorted(initial, key=lambda inp: inp.fitness, reverse=False).pop()
            fittest.add(fi)
        except IndexError:
            pass


if __name__ == "__main__":
    unittest.main()
