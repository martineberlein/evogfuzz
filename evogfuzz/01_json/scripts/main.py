#!/usr/bin/env python
from __future__ import print_function
from __future__ import division

import os
import subprocess
import tempfile
import random
import optparse
import createCountingGrammar
import util
import operator
from random import randrange
import re

VERSION = "1.0"
COUNTING_GRAMMAR_START_RULE = "main_dummy_rule_hope_for_no_collisions"

'''
This function is used to determine the fittest individuals by ranking all input files according to a fitness function.
Tournaments are held to select the fittest individuals from each tournament. 
These input files are then used to learn the new probabilistic grammar.
'''


def determine_fittest_individuals(current_generation):
    main_directory = os.getcwd()
    os.chdir(os.path.join(os.getcwd(), "antlrParser"))

    # Get all input files from the current generation
    input_files = util.getAllfiles(baseDirectory + "/run-" + str(current_generation) + "/samples/", fileExtension)
    print(baseDirectory + "/run-" + str(current_generation) + "/samples/")
    input_files.sort()

    # Using ANTLR to determine the derivation tree of an input file
    process = subprocess.Popen(["java", "org.antlr.v4.gui.TestRig", grammarName,
                                "main_dummy_rule_hope_for_no_collisions", "-tree"] + input_files,
                               stdout=subprocess.PIPE)

    os.chdir(main_directory)
    antlr_output = process.communicate()[0]

    individual_derivation_trees = re.findall(r'main_dummy_rule_hope_for_no_collisions.+?'+grammar_starting_rule,
                                             str(antlr_output))

    # Adding last derivation tree manually
    last_tree = str(antlr_output).split('(main_dummy_rule_hope_for_no_collisions')[100]
    individual_derivation_trees.append(last_tree)

    ranked_individuals = calculate_fitness(individual_derivation_trees, input_files)

    return tournament_selection(ranked_individuals)


'''
This function calculates the fitness of all individuals. 
A detailed description of the fitness function can be found in our paper.
This process is designed so the fitness function can be replaced easily.
The fitness function returns the input files as well as their fitness. 
'''


def calculate_fitness(individual_derivation_trees, input_files):
    print("---------------------------------------- ANALYSE ----------------------------------------")
    ranked_individuals = list()
    i = 0

    for tree in individual_derivation_trees:
        size = os.stat(input_files[i]).st_size
        # Check for empty files
        if size != 0:
            expansions = tree.count(' (')
            ratio = (parameter_lambda * expansions) / size

            fitness = ratio * expansions
        else:
            fitness = 0

        print("File: " + input_files[i] + "  Score: " + str(fitness))
        ranked_individual = [input_files[i], fitness]
        ranked_individuals.append(ranked_individual)
        i += 1

    # Sort input files according to fitness
    # Only debugging purpose
    # Print 10 best performing individuals
    ranked_individuals.sort(key=operator.itemgetter(1), reverse=True)
    print("---------------------------------------- BEST ----------------------------------------")
    for individual in ranked_individuals[0:10]:
        print(str(individual[0]) + ", score: " + str(individual[1]))

    return ranked_individuals


'''
This function determines the fittest individuals by running tournaments.
A list of the fittest individual of each tournament is returned. 
'''


def tournament_selection(input_files):
    random.shuffle(input_files)
    fittest_individuals = []

    # Running tournaments
    for i in range(tournament_number):
        current_tournament = []
        for individual in input_files[0:tournament_size]:
            current_tournament.append(individual)
            input_files.remove(individual)

        current_tournament.sort(key=operator.itemgetter(1), reverse=True)
        fittest_individuals.append(current_tournament[0])

    fittest_individuals.sort(key=operator.itemgetter(1), reverse=True)

    print("---------------------------------------- BEST (Tourn.) ----------------------------------------")
    for individual in fittest_individuals:
        print(individual[0] + ", score: " + str(individual[1]))

    print("----------------------------------------")

    # Only return the paths (individual[0])
    fittest_individuals_path = []
    for individual in fittest_individuals:
        fittest_individuals_path.append(individual[0])

    return fittest_individuals_path


'''
This function removes all empty lines in a given grammar file.
The idea is that each line in a grammar file corresponds to a production rule.
'''


def remove_empty_lines(filename):

    if not os.path.isfile(filename):
        print("{} does not exist ".format(filename))
        return
    with open(filename) as file:
        lines = file.readlines()

    with open(filename, 'w') as file:
        lines = filter(lambda x: x.strip(), lines)
        file.writelines(lines)


'''
This function splits a production rule into its individual alternatives
separated by a '@@'.
'''


def split_rule(production_rule):
    original_rule = production_rule
    alternatives = []
    i = 0
    while i == 0:
        temp = original_rule.split('@@', 1)
        alternatives.append(temp[0])
        if "@@" in temp[1]:
            temp = temp[1].split(" | ", 1)
            alternatives.append(temp[0])
            original_rule = temp[1]
        else:
            i = 1
            alternatives.append(temp[1])

    return alternatives


'''
This function is used to mutate a selected grammar rule.
During each generation one production rule is randomly chosen. 
The mutation is applied to the probabilities of the individual alternatives of a grammar rule. These probabilities
are set to random numbers between 0 (exclusive) and 1. Furthermore the probabilities are normalized so that the sum of
all alternatives is equal to 1.
'''


def mutate(current_generation):
    print("---------------------------------------- Mutation Phase ----------------------------------------")
    next_generation = current_generation + 1

    line_number = 0
    production_rule = ""
    string_before = ""
    string_after = ""

    # Remove all empty lines between the production rules of the prob. grammar
    remove_empty_lines(os.path.join(baseDirectory, "run-" + str(next_generation)) + "/bnfGrammar-" +
                       str(next_generation) + ".bnf")

    with open(os.path.join(baseDirectory, "run-" + str(next_generation)) + "/bnfGrammar-" +
              str(next_generation) + ".bnf") as f:
        lines = f.readlines()
        f.seek(0)
        # Count line numbers
        for line in f:
            if line.strip():
                line_number += 1

        f.seek(0)

        # Select a random production rule that will be mutated.
        # The production rule must have at least two alternatives
        terminator = 0
        random_rule = -1
        while terminator == 0:
            random_rule = randrange(1, line_number)
            if "@@" in lines[random_rule]:
                terminator = 1

        print("Mutate production rule: " + str(random_rule))

        # Separate the chosen rule from the rest of the grammar
        for i in range(line_number):
            if i < random_rule:
                string_before += f.readlines()[i]
                f.seek(0)
            elif i > random_rule:
                string_after += f.readlines()[i]
                f.seek(0)
            else:
                production_rule = f.readlines()[i]
                f.seek(0)

        alternatives = split_rule(production_rule)

    # Set new probabilities for the production rule
    new_probabilities = derive_new_probabilities(len(alternatives) // 2)
    count = 0

    new_line = [0] * len(alternatives)
    new_production_rule = ""

    # Combine the probabilities with the alternatives
    # This has to be conforming to the semantics of the grammar file
    for i in range(len(alternatives)):
        if i % 2 == 0:
            new_line[i] = str(alternatives[i]) + " @@ "
            new_production_rule += str(alternatives[i]) + " @@ "
        else:
            if i == len(alternatives) - 1:
                new_production_rule += str(new_probabilities[count]) + ";\n"
            else:
                new_production_rule += str(new_probabilities[count]) + " |"
                count += 1

    # New mutated grammar
    mutated_grammar = string_before + new_production_rule + string_after

    with open(os.path.join(baseDirectory, "run-" + str(next_generation)) + "/bnfGrammar-" +
              str(next_generation) + ".bnf", "w") as f:
        f.write(mutated_grammar)
        f.close()

    print("--------------------------------------------------------------------------------")


'''
This function is used to produce the random normalized probabilities for a mutated grammar rule.
'''


def derive_new_probabilities(n):
    new_probabilities = [0] * n
    probabilities_sum = 0

    for i in range(n):
        new_probabilities[i] = random.randint(1, 100)
        probabilities_sum += new_probabilities[i]

    # Normalize all probabilities
    for i in range(n):
        new_probabilities[i] = new_probabilities[i] / probabilities_sum

    return new_probabilities


'''
This function creates the new probabilistic grammar by using ANTLR parser generator.
'''


def create_probabilistic_grammar(fittest_individuals, new_grammar, next_generation_directory):
    print("---------------------------------------- Learn Grammar ----------------------------------------")
    main_directory = os.getcwd()

    os.chdir(os.path.join(os.getcwd(), "antlrParser"))
    with open(os.path.join(baseDirectory, next_generation_directory, new_grammar), "w") as outputGrammar,\
            tempfile.NamedTemporaryFile(mode="w") as tempSampleFile:
        for file in fittest_individuals:
            with open(file, "r") as f:
                tempSampleFile.writelines(f.readlines())
                f.close()

        tempSampleFile.seek(0)

        subprocess.call(["java", "org.antlr.v4.gui.TestRig", grammarName, COUNTING_GRAMMAR_START_RULE],
                        stdin=tempSampleFile, stdout=outputGrammar)

    outputGrammar.close()
    tempSampleFile.close()
    os.chdir(main_directory)
    print("--------------------------------------------------------------------------------")


'''
This function creates or learns a new probabilistic grammar from the current generation of input files.
The new probabilistic grammar is learned from the best performing or fittest individuals.
'''


def learn_new_probabilistic_grammar(current_generation):
    fittest_individuals = determine_fittest_individuals(current_generation)

    # If specified append a base file
    # This process is explicitly not necessary and is for debugging purposes only
    if options.baseFile:
        fittest_individuals.append(os.path.join(os.getcwd(), "bnf", "base", "base." + fileExtension))

    next_generation = current_generation + 1
    new_grammar_name = "bnfGrammar-" + str(next_generation) + ".bnf"
    next_generation_directory = "run-" + str(next_generation)
    os.mkdir(os.path.join(baseDirectory, next_generation_directory), 0o755)
    create_probabilistic_grammar(fittest_individuals, new_grammar_name, next_generation_directory)


'''
This function generates new input files according to a previously learned probabilistic grammar.
It uses the input generated developed by Pavese et al. in their paper 'Inputs from hell'
'''


def generate_input_files(current_generation):
    current_generation_directory = "run-" + str(current_generation)
    grammar_name = "bnfGrammar-" + str(current_generation) + ".bnf"
    current_generation_path = os.path.join(baseDirectory, current_generation_directory)

    print("Generiere neue Inputdaten anhand der neuen Prob. Grammatik")
    subprocess.call(["java", "-Xss1g", "-Xms256m", "-Xmx4g", "-jar", "./inputGenerator/tribble.jar", "generate",
                     "--suffix=." + fileExtension,
                     "--mode=10-20-probabilistic-100", "--out-dir=" + current_generation_path + "/samples",
                     "--grammar-file=" + current_generation_path + "/" + str(grammar_name)])
    print("Generierung abgeschlossen")


'''
This function executes the currently generated input files with the SUT. 
Additionally, it checks whether any exceptions were triggered. 
'''


def execute_input_files(current_generation):
    print("---------------------------------------- Run Tests ----------------------------------------")
    input_files_directory = "run-" + str(current_generation) + "/samples"

    input_files = os.path.join(baseDirectory, input_files_directory)
    results_output_directory = os.path.join(baseDirectory, "run-" + str(current_generation), "results.csv")
    subprocess.call(
        ["java", "-jar", "./tools/coverage-drivers-1.0-SNAPSHOT.jar", str(subject), "file-coverage-all", input_files,
         results_output_directory])


'''
This function creates the initial Grammar of the target Language
'''


def create_initial_grammar(initial_generation):
    print("---------------------------------------- Create Initial Grammar ----------------------------------------")
    initial_generation_directory = "run-" + str(initial_generation)
    os.mkdir(os.path.join(baseDirectory, initial_generation_directory), 0o755)
    new_grammar_name = "bnfGrammar-" + str(initial_generation) + ".bnf"
    initial_input_files = util.getAllfiles(os.path.join(os.getcwd(), "initialSamples"), fileExtension)

    create_probabilistic_grammar(initial_input_files, new_grammar_name, initial_generation_directory)


'''
This is the main function of EvoGFuzz
'''


def run_evogfuzz():
    for current_generation in range(100000):
        generate_input_files(current_generation)
        execute_input_files(current_generation)
        learn_new_probabilistic_grammar(current_generation)
        if current_generation != 0:
            mutate(current_generation)


if __name__ == "__main__":
    # Parser Options
    parser = optparse.OptionParser()
    parser.add_option("-f", "--file", action="store", type="string", dest="filename")
    parser.add_option("-o", "--genCountingGrammar", action="store_true", dest="countingGrammar")
    parser.add_option("-b", "--baseFile", action="store_true", dest="baseFile")
    parser.add_option("-p", "--outDir", type="string", dest="outdir")
    parser.add_option("-e", "--fileExtension", type="string", dest="fileExt")
    parser.add_option("-s", "--subject", type="string", dest="sub")
    parser.add_option("-g", "--grammar_start_rule", action="store", type="string", dest="start_rule")
    (options, args) = parser.parse_args()

    # Grammar
    grammarName = options.filename
    grammar_starting_rule = options.start_rule
    fileExtension = options.fileExt

    # SUT (Subject-under-Test)
    subject = options.sub

    if options.countingGrammar:
        createCountingGrammar.createCountingGrammar(grammarName)

    baseDirectory = os.path.join(os.getcwd(), options.outdir)

    # Parameters
    number_individuals = 100

    # Tournament selection and elitism
    elitism_rate = 5
    tournament_size = 10
    tournament_number = 10

    # Fitness function
    parameter_lambda = 1.5

    # Initial grammar learned from initial input corpus
    create_initial_grammar(0)

    # start EvoGFuzz
    run_evogfuzz()
