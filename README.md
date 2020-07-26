# EvoGFuzz: Evolutionary Grammar-Based Fuzzing
This repository provides the tool (*EvoGFuzz*) for the paper *Evolutionary Grammar-Based Fuzzing* accepted at SSBSE'2020.

Authors:
Martin Eberlein, [Yannic Noller](https://yannicnoller.github.io), [Thomas Vogel](https://thomas-vogel.github.io) and [Lars Grunske](https://www.informatik.hu-berlin.de/de/Members/lars-grunske).

This repository includes: 
* the scripts to rerun all experiments:
	* JSON: [evogfuzz/01_json/runAllJson.sh](./evogfuzz/01_json/runAllJson.sh)
	* JavaScript: [evogfuzz/02_javaScript/runAllJavaScript.sh](./evogfuzz/02_javaScript/runAllJavaScript.sh)
	* CSS3: [evogfuzz/03_css/runAllCss3.sh](./evogfuzz/03_css/runAllCss3.sh)
* the summarized experiment results: [results](./results)
* and the source code of EvoGFuzz: (evogfuzz*/scripts/)

As described in the paper, we have built *EvoGFuzz* on the work of [Pavese et al.](https://arxiv.org/abs/1812.07525). Since the authors have not yet made their tools publicly available, we are not able to include the "Input Generator" and the Test Subjects in this repository. We plan to add the tools as soon as the authors publish their tools.
Since the Input Generator is one of the key components of EvoGFuzz the replication of our results is limited.

## Requirements
* Git, Build-Essentials
* Python3.7 , Numpy Package
* ANTLR parser generator (Version 4.7.1)
* recommended: Ubuntu 18.04.1 LTS

## Folder Structure

#### evogfuzz
The folder *evogfuzz* contains 3 subfolders: *01_json*, *02_javaScript* and *03_css*. The substructure is the same for all folders:
*  *antlrCountingGrammar*: contains the generated counting grammar
*  *antlrParser*: contains the with ANTLR generated parser
*  *bnf*: contains the grammar in bnf format
*  *initialSamples*: contains the initial input corpus
*  *inputGenerator*: contains the input generation tool from Pavese et al. (Currently not included)
*  *scripts*: contains the source code of EvoGFuzz
*  *tools*: contains the tool to generate the counting grammar and the tool that contains the instrumented versions of the the tested subjects (Currently not included)

#### results
The folder *results* contains the results for *EvoGFUZZ* and the *Baseline* shown in the paper. For both approaches all ten test subjects were evaluated and for each test subject 30 repetitions have been conducted. 

## Complete Evaluation Reproduction


## Maintainers

* **Martin Eberlein**


## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
