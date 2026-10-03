from __future__ import annotations

import unittest
from evogfuzz.derivation_tree import DerivationTree, is_nonterminal, RE_NONTERMINAL


class TestDerivationTree(unittest.TestCase):
    def test_is_nonterminal(self):
        self.assertTrue(is_nonterminal("<start>"))
        self.assertTrue(is_nonterminal("<expr>"))
        self.assertFalse(is_nonterminal("123"))
        self.assertFalse(is_nonterminal("+"))
        self.assertFalse(is_nonterminal("<start >"))

    def test_tree_construction_and_properties(self):
        leaf1 = DerivationTree("1")
        leaf2 = DerivationTree("2")
        op = DerivationTree("+")
        root = DerivationTree("<expr>", [leaf1, op, leaf2])

        self.assertEqual(root.value, "<expr>")
        self.assertIsNotNone(root.children)
        self.assertEqual(len(root.children), 3)
        self.assertEqual(root.children[0].value, "1")
        self.assertEqual(root.children[1].value, "+")
        self.assertEqual(root.children[2].value, "2")

    def test_to_string(self):
        leaf1 = DerivationTree("1")
        leaf2 = DerivationTree("2")
        op = DerivationTree("+")
        root = DerivationTree("<expr>", [leaf1, op, leaf2])
        self.assertEqual(root.to_string(), "1+2")
        self.assertEqual(str(root), "1+2")

    def test_parse_tree_roundtrip(self):
        parse_tree = ("<expr>", [("1", None), ("+", None), ("2", None)])
        tree = DerivationTree.from_parse_tree(parse_tree)
        self.assertEqual(tree.to_string(), "1+2")

        back = tree.to_parse_tree()
        self.assertEqual(back, parse_tree)

    def test_tuple_unpacking_and_indexing(self):
        leaf = DerivationTree("1")
        tree = DerivationTree("<expr>", [leaf])

        node, children = tree
        self.assertEqual(node, "<expr>")
        self.assertEqual(len(children), 1)
        self.assertEqual(children[0], leaf)

        self.assertEqual(tree[0], "<expr>")
        self.assertEqual(tree[-2], "<expr>")
        self.assertEqual(tree[1], [leaf])
        self.assertEqual(tree[-1], [leaf])
        self.assertEqual(len(tree), 2)

        with self.assertRaises(IndexError):
            _ = tree[2]
        with self.assertRaises(IndexError):
            _ = tree[-3]

    def test_structural_hash_and_equality(self):
        tree1 = DerivationTree("<expr>", [DerivationTree("1")])
        tree2 = DerivationTree("<expr>", [DerivationTree("1")])
        tree3 = DerivationTree("<expr>", [DerivationTree("2")])

        self.assertEqual(tree1, tree2)
        self.assertNotEqual(tree1, tree3)
        self.assertEqual(hash(tree1), hash(tree2))
        self.assertEqual(tree1.structural_hash(), tree2.structural_hash())

    def test_slots_defined(self):
        tree = DerivationTree("test")
        self.assertTrue(hasattr(tree, "__slots__"))
        with self.assertRaises(AttributeError):
            tree.arbitrary_attribute = 42

    def test_pattern_matching(self):
        tree = DerivationTree("<expr>", (DerivationTree("1"),))
        match tree:
            case DerivationTree(value=val, children=ch):
                self.assertEqual(val, "<expr>")
                self.assertIsNotNone(ch)
            case _:
                self.fail("Pattern match failed")


if __name__ == "__main__":
    unittest.main()
