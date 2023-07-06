from typing import Generator, Optional, Dict

from isla.derivation_tree import DerivationTree

from evogfuzz.oracle import OracleResult


class Input:
    """
    Class describing a test input.
    """

    def __init__(self, tree: DerivationTree, oracle: OracleResult = None):
        assert isinstance(tree, DerivationTree)
        self.__tree: DerivationTree = tree
        self.__oracle: Optional[OracleResult] = oracle
        self.__features: Optional[Dict] = None
        self.__fitness: float = float()

    @property
    def tree(self) -> DerivationTree:
        return self.__tree

    @property
    def oracle(self) -> OracleResult:
        return self.__oracle

    @property
    def features(self) -> Dict:
        return self.__features

    @property
    def fitness(self) -> float:
        return self.__fitness

    @oracle.setter
    def oracle(self, oracle_: OracleResult):
        self.__oracle = oracle_

    @features.setter
    def features(self, features_: Dict):
        self.__features = features_

    @fitness.setter
    def fitness(self, fitness_: float):
        self.__fitness = fitness_

    def __str__(self) -> str:
        return str(self.__tree)

    def __hash__(self):
        return self.__tree.structural_hash()

    def __eq__(self, other):
        if not isinstance(other, Input):
            return False
        return self.__hash__() == other.__hash__()

    def __iter__(self) -> Generator[DerivationTree | OracleResult | None, None, None]:
        """
        Allows tuple unpacking: tree, oracle = input

        :return: An iterator of two elements: The derivation tree and the execution oracle.
        """
        yield self.tree
        yield self.oracle

    def __getitem__(self, item: int) -> Optional[DerivationTree] | OracleResult:
        """
        Allows accessing the input's derivation tree using index 0 and the oracle using index 1.

        param item: The index of the item to get (0 -> tree, 1 -> oracle)
        :return: The input's tree or oracle.
        """
        assert isinstance(item, int)
        assert 0 <= item <= 1, "Can only access element 0 (tree) or 1 (oracle)"
        if item == 0:
            return self.tree
        else:
            return self.oracle
