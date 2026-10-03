import unittest

from evogfuzz.types import Grammar
from evogfuzz.parser import EarleyParser
from evogfuzz.derivation_tree import DerivationTree

from evogfuzz.grammar_transformation import get_transformed_grammar
from evogfuzz.input import Input

EXPR_GRAMMAR: Grammar = {
    "<start>": ["<expr>"],
    "<expr>": ["<term> + <expr>", "<term> - <expr>", "<term>"],
    "<term>": ["<factor> * <term>", "<factor> / <term>", "<factor>"],
    "<factor>": [
        "+<factor>",
        "-<factor>",
        "(<expr>)",
        "<integer>.<integer>",
        "<integer>",
    ],
    "<integer>": ["<digit><integer>", "<digit>"],
    "<digit>": ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"],
}


class TestGrammarTransformation(unittest.TestCase):
    def test_grammar_transformation(self):
        test_inputs = set()
        for inp in ["1 + 2", "2 + 1"]:
            test_inputs.add(
                Input(
                    DerivationTree.from_parse_tree(
                        next(EarleyParser(EXPR_GRAMMAR).parse(inp))
                    )
                )
            )

        transformed_grammar = get_transformed_grammar(
            test_inputs, EXPR_GRAMMAR, recursive=True
        )
        print(transformed_grammar)

        self.assertTrue(
            all(map(lambda x: x in transformed_grammar["<expr>"], ["1 + 2", "2"]))
        )
        self.assertTrue(
            all(map(lambda x: x in transformed_grammar["<term>"], ["1", "2"]))
        )
        self.assertTrue(
            all(map(lambda x: x in transformed_grammar["<factor>"], ["1", "2"]))
        )
        self.assertTrue(
            all(map(lambda x: x in transformed_grammar["<integer>"], ["1", "2"]))
        )
        self.assertTrue(
            all(map(lambda x: x in transformed_grammar["<digit>"], ["1", "2"]))
        )

        n = set()
        inp = "1 + 2"
        # transformed_grammar['<start>'] = ["<expr>"]

        p = EarleyParser(transformed_grammar)
        for tree in p.parse(inp):
            n.add(Input(DerivationTree.from_parse_tree(tree)))

        self.assertTrue(len(n) == 22)


if __name__ == "__main__":
    unittest.main()
