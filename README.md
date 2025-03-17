[![Python Version](https://img.shields.io/pypi/pyversions/evogfuzz)](https://pypi.org/project/evogfuzz/)
[![GitHub release](https://img.shields.io/github/v/release/martineberlein/evogfuzzplusplus)](https://github.com/martineberlein/evogfuzzplusplus/releases)
[![PyPI](https://img.shields.io/pypi/v/evogfuzz)](https://pypi.org/project/evogfuzz/)
[![Tests](https://github.com/martineberlein/evogfuzzplusplus/actions/workflows/test_evogfuzz.yml/badge.svg)](https://github.com/martineberlein/evogfuzzplusplus/actions/workflows/test_evogfuzz.yml)
[![Licence](https://img.shields.io/github/license/martineberlein/evogfuzzplusplus)](https://img.shields.io/github/license/martineberlein/evogfuzzplusplus)
[![Code style: black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)
&nbsp;

# EvoGFuzz

Welcome to the **EvoGFuzz** repository! This repository houses the source code for the innovative grammar-based fuzzing tool EvoGFuzz, as first documented in our paper _Evolutionary Grammar-Based Fuzzing_ that was presented at [SSBSE'2020](http://ssbse2020.di.uniba.it/).

## Quickstart

To provide an immediate understanding of EvoGFuzz's capabilities, let's dive into a simple yet illustrative example using a program we've labeled **The Calculator**.

The Calculator program is written in Python and is capable of evaluating mathematical expressions, including arithmetic equations and trigonometric functions:

```python
import math

def arith_eval(inp) -> float:
    return eval(
        str(inp), {"sqrt": math.sqrt, "sin": math.sin, "cos": math.cos, "tan": math.tan}
    )
```

We use an oracle function to discern between normal and faulty behavior:

```python 
from debugging_framework.input.oracle import OracleResult

def oracle(inp: str) -> OracleResult:
    try:
        arith_eval(inp)
        return OracleResult.PASSING
    except ValueError:
        return OracleResult.FAILING
    
    return OracleResult.PASSING
``` 

We can see this in action by testing a few initial inputs:

```python
initial_inputs = ['cos(10)', 'sqrt(28367)', 'tan(-12)', 'sqrt(3)']

for inp in initial_inputs:
    print(inp.ljust(20), oracle(inp))
```

This will yield the following output:

```
cos(10)              PASSING
sqrt(28367)          PASSING
tan(-12)             PASSING
sqrt(3)              PASSING
```

We apply our `EvoGFuzz` class to carry out fuzz testing using evolutionary grammar-based fuzzing. This is aimed at uncovering potential defects in our 'calculator' function.

First, we must define the input format of the calculator using a grammar:

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

With the grammar in place, we can initialize **EvoGFuzz** with this grammar, the sample inputs, and the oracle function:

```python
from evogfuzz.evogfuzz_class import EvoGFuzz

epp = EvoGFuzz(
    grammar=grammar,
    oracle=oracle,
    inputs=initial_inputs,
    iterations=10
)
```

Upon creating the `EvoGFuzz` instance, we can execute the fuzzing process. The `fuzz()` method runs the fuzzing iterations, evolving the inputs based on our fitness function, and returns a collection of inputs that lead to exceptions in the 'calculator' function.

```python
found_exception_inputs = epp.fuzz()
```

Lastly, we can examine the inputs that resulted in exceptions.
This output can provide valuable insight into potential weaknesses in the 'calculator' function that need to be addressed.

```python
for inp in list(found_exception_inputs)[:20]:
    print(str(inp).ljust(30), inp.oracle)
```

Output:

````
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
sqrt(-68)                      FAILING
sqrt(-2538)                    FAILING
sqrt(-14)                      FAILING
sqrt(-134)                     FAILING
sqrt(-279)                     FAILING
sqrt(-748)                     FAILING
sqrt(-6)                       FAILING
sqrt(-11)                      FAILING
sqrt(-140)                     FAILING
sqrt(-32)                      FAILING
````

This process illustrates the power of evolutionary grammar-based fuzzing in identifying new defects within our system.
By applying evolutionary algorithms to our fuzzing strategy, we can guide the search towards more defect-prone regions of the input space.

### More Examples:

If you want to explore more of how EvoGFuzz works, make sure to have a look at the jupyter notebooks in the notebooks folder:

- **[evogfuzz_demo.ipynb](./notebooks/evoggen_demo.ipynb):** A quick and more detailed tutorial on how to setup up EvoGFuzz. It also showcases how to change the fitness functions.
- **[evoggen_demo.ipynb](./notebooks/evoggen_demo.ipynb):** This notebook demonstrates the capabilities of EvoGGen, a version of EvoGFuzz, that optimizes the probablistic grammar to reproduce individual failures.
- **[readme.ipynb](./notebooks/readme.ipynb):** The executable example from this README.md.


## Install, Development, Testing, Build

### Install
If all external dependencies are available, a simple pip install evogfuzz suffices.
We recommend installing EvoGFuzz inside a virtual environment (virtualenv), commands differ slightly for MacOS/Linux and Windows users:

```
python3.10 -m venv venv
source venv/bin/activate

pip install --upgrade pip
pip install evogfuzz
```

Now, the evogfuzz command should be available on the command line within the virtual environment.

### Development and Testing

For development, we recommend using EvoGFuzz inside a virtual environment (virtualenv).
At the moment, EvoGFuzz only works with Python 3.10. 
To install the development dependencies, run the following commands:

```
git clone https://github.com/martineberlein/evogfuzz.git
cd evogfuzz/

python3.10 -m venv venv
source venv/bin/activate

pip install --upgrade pip

# Run tests
pip install -e .[dev]
pip install -r requirements.txt

python3 -m pytest
```
