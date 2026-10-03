# EvoGFuzz

[![Python Version](https://img.shields.io/pypi/pyversions/evogfuzz)](https://pypi.org/project/evogfuzz/)
[![PyPI Version](https://img.shields.io/pypi/v/evogfuzz)](https://pypi.org/project/evogfuzz/)
[![Tests](https://github.com/martineberlein/evogfuzz/actions/workflows/test_evogfuzz.yml/badge.svg)](https://github.com/martineberlein/evogfuzz/actions/workflows/test_evogfuzz.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Code style: black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)

Welcome to **EvoGFuzz**! This repository houses the source code for the evolutionary grammar-based fuzzing tool EvoGFuzz, as first documented in our paper _Evolutionary Grammar-Based Fuzzing_ presented at [SSBSE 2020](http://ssbse2020.di.uniba.it/).

---

## Key Features

- **Evolutionary Grammar-Based Fuzzing**: Guides input generation by learning and mutating probabilistic grammars toward defect-prone regions.
- **EvoGGen Failure Reproduction**: Specializes probabilistic grammars to efficiently isolate and reproduce specific bugs.
- **Lightweight & Self-Contained**: Pure Python with no heavy external constraint solvers or outdated dependencies.
- **Standard Compatibility**: Built on context-free grammars and derivation tree structures compatible with *The Fuzzing Book*.

---

## Quickstart

To understand EvoGFuzz's capabilities, let's look at an illustrative example using **The Calculator**.

The calculator program evaluates mathematical expressions, including arithmetic equations and trigonometric functions:

```python
import math

def arith_eval(inp: str) -> float:
    return eval(
        str(inp),
        {"__builtins__": None},
        {"sqrt": math.sqrt, "sin": math.sin, "cos": math.cos, "tan": math.tan},
    )
```

We define an oracle to discern normal from faulty behavior (e.g., negative square roots producing `ValueError`):

```python
from evogfuzz import OracleResult

def oracle(inp: str) -> OracleResult:
    try:
        arith_eval(inp)
        return OracleResult.PASSING
    except ValueError:
        return OracleResult.FAILING
```

We can test initial seed inputs:

```python
initial_inputs = ["cos(10)", "sqrt(28367)", "tan(-12)", "sqrt(3)"]

for inp in initial_inputs:
    print(inp.ljust(20), oracle(inp))
```

Output:
```
cos(10)              PASSING
sqrt(28367)          PASSING
tan(-12)             PASSING
sqrt(3)              PASSING
```

### Evolutionary Fuzzing with EvoGFuzz

Define the input format using a standard context-free grammar:

```python
import string

grammar = {
    "<start>": ["<arith_expr>"],
    "<arith_expr>": ["<function>(<number>)"],
    "<function>": ["sqrt", "sin", "cos", "tan"],
    "<number>": ["<maybe_minus><onenine><maybe_digits>"],
    "<maybe_minus>": ["", "-"],
    "<onenine>": [str(num) for num in range(1, 10)],
    "<digit>": list(string.digits),
    "<maybe_digits>": ["", "<digits>"],
    "<digits>": ["<digit>", "<digit><digits>"],
}
```

Initialize and run **EvoGFuzz**:

```python
from evogfuzz import EvoGFuzz

fuzzer = EvoGFuzz(
    grammar=grammar,
    oracle=oracle,
    inputs=initial_inputs,
    iterations=10,
)

found_exception_inputs = fuzzer.fuzz()
```

Inspect the failure-inducing inputs found by evolutionary exploration:

```python
for inp in list(found_exception_inputs)[:10]:
    print(str(inp).ljust(30), inp.oracle)
```

Sample output:
```
sqrt(-739)                     FAILING
sqrt(-84358)                   FAILING
sqrt(-649)                     FAILING
sqrt(-18)                      FAILING
sqrt(-23306)                   FAILING
sqrt(-388)                     FAILING
sqrt(-354)                     FAILING
sqrt(-795)                     FAILING
sqrt(-2452969)                 FAILING
sqrt(-1989994)                 FAILING
```

By evolving probabilistic weights across iterations, EvoGFuzz quickly discovers and concentrates on the faulty domain (negative arguments to `sqrt`).

---

## Interactive Notebooks

Explore more examples and tutorials in the `notebooks` directory:

- **[evogfuzz_demo.ipynb](./notebooks/evogfuzz_demo.ipynb):** Comprehensive tutorial on configuring EvoGFuzz and customizing fitness functions.
- **[evoggen_demo.ipynb](./notebooks/evoggen_demo.ipynb):** Demonstrates EvoGGen for learning probabilistic grammars that reproduce specific defect classes.
- **[readme.ipynb](./notebooks/readme.ipynb):** Interactive version of the Quickstart calculator walkthrough.

---

## Installation & Development

### Requirements

- Python >= 3.10

### Install from PyPI

```bash
pip install evogfuzz
```

### Development Setup

```bash
git clone https://github.com/martineberlein/evogfuzz.git
cd evogfuzz

python3 -m venv .venv
source .venv/bin/activate

pip install --upgrade pip
pip install -e ".[dev]"
```

### Running Tests

```bash
pytest
```

---

## Citation

If you use EvoGFuzz in academic research, please cite our SSBSE 2020 paper:

```bibtex
@inproceedings{eberlein2020evogfuzz,
  title     = {Evolutionary Grammar-Based Fuzzing},
  author    = {Eberlein, Martin and Grunske, Lars},
  booktitle = {International Symposium on Search Based Software Engineering (SSBSE)},
  pages     = {183--189},
  year      = {2020},
  publisher = {Springer}
}
```

---

## License

This project is licensed under the [MIT License](LICENSE).
