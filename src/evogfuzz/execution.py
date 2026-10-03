from __future__ import annotations

import signal
from abc import ABC, abstractmethod
from collections import defaultdict
from typing import Any

from evogfuzz.oracle import OracleResult
from evogfuzz.types import BatchOracleType, OracleType

__all__ = [
    "ManageTimeout",
    "Failure",
    "Report",
    "SingleFailureReport",
    "MultipleFailureReport",
    "TResultMonad",
    "ExecutionHandler",
    "SingleExecutionHandler",
    "BatchExecutionHandler",
]


class ManageTimeout:
    """Context manager for setting a real-time alarm timeout."""

    __slots__ = ("timeout", "old_handler")

    def __init__(self, timeout: float) -> None:
        self.timeout: float = timeout
        self.old_handler: Any = None

    def __enter__(self) -> ManageTimeout:
        self.old_handler = signal.signal(signal.SIGALRM, self.alarm_handler)
        self.set_alarm(self.timeout)
        return self

    def __exit__(self, exc_type: Any, exc_value: Any, traceback: Any) -> None:
        self.cancel_alarm()
        if self.old_handler is not None:
            signal.signal(signal.SIGALRM, self.old_handler)

    @staticmethod
    def alarm_handler(signum: int, frame: Any) -> None:
        raise TimeoutError("Function call timed out")

    @staticmethod
    def set_alarm(seconds: float) -> None:
        signal.setitimer(signal.ITIMER_REAL, seconds)

    @staticmethod
    def cancel_alarm() -> None:
        signal.setitimer(signal.ITIMER_REAL, 0)


class Failure:
    """Encapsulates an exception and its message as a unique failure signature."""

    __slots__ = ("exception", "message")

    def __init__(self, exception: Exception) -> None:
        self.exception: Exception = exception
        self.message: str = str(exception)

    def __hash__(self) -> int:
        return hash(type(self.exception)) + hash(self.message)

    def __eq__(self, other: object) -> bool:
        if not isinstance(other, Failure):
            return False
        return (
            isinstance(other.exception, type(self.exception))
            and other.message == self.message
        )

    def __repr__(self) -> str:
        if self.message:
            return f"{type(self.exception).__name__}: {self.message}"
        return f"{type(self.exception).__name__}"

    def __str__(self) -> str:
        return self.__repr__()


class Report(ABC):
    """Abstract base class for failure tracking reports."""

    def __init__(self, name: str = "EvoGFuzz") -> None:
        self.failures: dict[Failure, set[Any]] = defaultdict(set)
        self.name: str = name

    def __repr__(self) -> str:
        report = f"Report for {self.name}\n"
        report += (
            f"Found {len(self.get_all_failing_inputs())} failure-inducing"
            f" inputs ({len(self.failures.keys())} Exceptions):"
        )
        if len(self.failures.keys()) > 0:
            report += "\n"
            report += "\n".join(
                f"{failure}: {len(self.failures[failure])}" for failure in self.failures
            )
        return report

    def __str__(self) -> str:
        return self.__repr__()

    @abstractmethod
    def add_failure(
        self,
        test_input: Any,
        failure: Exception | Failure | None = None,
        **kwargs: Any,
    ) -> None:
        """Record a failure for the given test input."""
        raise NotImplementedError

    def get_failures(self) -> dict[Failure, set[Any]]:
        return self.failures

    def get_all_failing_inputs(self) -> list[Any]:
        flat: list[Any] = []
        for v in self.failures.values():
            flat.extend(list(v))
        return flat

    def to_dict_complete(self) -> dict[Failure, set[Any]]:
        return self.failures

    def to_dict(self) -> dict[Failure, int]:
        return {failure: len(inputs) for failure, inputs in self.failures.items()}


class SingleFailureReport(Report):
    """Report that coalesces all failures under a single generic exception bucket."""

    def add_failure(
        self,
        test_input: Any,
        failure: Any = None,
        **kwargs: Any,
    ) -> None:
        self.failures[Failure(Exception())].add(test_input)


class MultipleFailureReport(Report):
    """Report that partitions inputs by distinct exception types and messages."""

    def add_failure(
        self,
        test_input: Any,
        failure: Exception | Failure | None = None,
        **kwargs: Any,
    ) -> None:
        if failure is None or not isinstance(failure, (Exception, Failure)):
            failure_obj = Failure(Exception())
        elif isinstance(failure, Exception):
            failure_obj = Failure(failure)
        else:
            failure_obj = failure

        self.failures[failure_obj].add(test_input)


class TResultMonad:
    """Lightweight result wrapper for oracle evaluation tuples."""

    __slots__ = ("_value",)

    def __init__(self, value: Any) -> None:
        self._value: tuple[OracleResult, Exception | None] = (
            (value, None) if not isinstance(value, tuple) else value
        )

    def map(self, func: Any) -> TResultMonad:
        return TResultMonad(func(*self._value))

    def value(self) -> tuple[OracleResult, Exception | None]:
        return self._value


class ExecutionHandler(ABC):
    """Abstract executor that evaluates inputs with an oracle and records failures."""

    def __init__(self, oracle: OracleType | BatchOracleType) -> None:
        self.oracle: OracleType | BatchOracleType = oracle

    @staticmethod
    def map_result(result: OracleResult) -> bool:
        return result is OracleResult.FAILING

    @staticmethod
    def add_to_report(
        report: Report, test_input: Any, exception: Exception | None
    ) -> None:
        report.add_failure(test_input, exception)

    @abstractmethod
    def label(self, test_inputs: set[Any], report: Report) -> None:
        """Evaluate a set of test inputs and record any failures into the report."""
        raise NotImplementedError


class SingleExecutionHandler(ExecutionHandler):
    """Executes test inputs one-by-one against a single oracle callable."""

    def _get_label(self, test_input: Any) -> TResultMonad:
        return TResultMonad(self.oracle(test_input))

    def label(self, test_inputs: set[Any], report: Report) -> None:
        for inp in test_inputs:
            label, exception = self._get_label(inp).value()
            inp.oracle = label
            if self.map_result(label):
                self.add_to_report(report, inp, exception)

    def label_strings(self, test_inputs: set[str], report: Report) -> None:
        for inp in test_inputs:
            label, exception = self._get_label(inp).value()
            if self.map_result(label):
                self.add_to_report(report, inp, exception)


class BatchExecutionHandler(ExecutionHandler):
    """Executes batches of test inputs against a batch-capable oracle callable."""

    def _get_label(self, test_inputs: set[Any]) -> list[tuple[Any, TResultMonad]]:
        results = self.oracle(test_inputs)
        return [
            (inp, TResultMonad(result)) for inp, result in zip(test_inputs, results)
        ]

    def label(self, test_inputs: set[Any], report: Report) -> None:
        test_results = self._get_label(test_inputs)
        for inp, test_result in test_results:
            label, exception = test_result.value()
            inp.oracle = label
            if self.map_result(label):
                self.add_to_report(report, inp, exception)
