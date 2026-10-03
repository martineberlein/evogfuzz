from __future__ import annotations

import logging
from evogfuzz.input import Input

__all__ = ["Tournament"]

logger = logging.getLogger(__name__)


class Tournament:
    """Performs tournament selection on a set of test inputs based on fitness."""

    __slots__ = ("test_inputs", "tournament_rounds", "tournament_size")

    def __init__(
        self,
        test_inputs: set[Input],
        tournament_rounds: int = 10,
        tournament_size: int = 10,
    ) -> None:
        """Initialize the tournament selector.

        Args:
            test_inputs: Set of inputs available for selection.
            tournament_rounds: Number of tournament rounds to conduct.
            tournament_size: Number of competitors in each tournament round.
        """
        self.test_inputs: set[Input] = test_inputs
        self.tournament_rounds: int = tournament_rounds
        self.tournament_size: int = tournament_size

    def select_fittest_individuals(self) -> set[Input]:
        """Conduct tournament rounds and return the set of winning inputs.

        Returns:
            Set of selected fittest Input instances.
        """
        fittest: set[Input] = set()

        try:
            for _ in range(self.tournament_rounds):
                current_round: list[Input] = list(self.test_inputs)[
                    : self.tournament_size
                ]
                for inp in current_round:
                    self.test_inputs.remove(inp)
                fi = sorted(
                    current_round, key=lambda inp: inp.fitness, reverse=False
                ).pop()
                fittest.add(fi)
        except IndexError:
            logger.debug("Tournament size too big! No more inputs left to select!")

        return fittest
