#!/usr/bin/env python
from __future__ import print_function
from __future__ import division

import glob
import os
import subprocess
import sys
import tempfile
import random
import optparse
import operator
import linecache
from random import randrange
import re

################## EVOLUTIONARY GRAMMAR-BASED FUZZER ##################


VERSION = "0.5"
COUNTING_GRAMMAR_START_RULE = "main_dummy_rule_hope_for_no_collisions"


def getAllfiles(fileLocation, extension):
    files = "*." + extension

    iter_files = fileLocation + "/" + files
    itemlist = glob.glob(iter_files)
    return itemlist



# IMPROVED FITNESS FUNCTION

def improvedFitness(inputFiles):
    ranking = list()
    number = 1
    for file in inputFiles:
        print(str(number) + "/ 100")
        complexity = calculateComplexity(file)
        if os.stat(file).st_size != 0:
            f = complexity * (1.5 * complexity) / os.stat(file).st_size
            #fitness = sophisticatedFitness(file) * (0.2 * complexity) / os.stat(file).st_size
            #f = fitness
            # print(f)
            #print(f)
        else:
            f = 0

        t = [file, f]
        ranking.append(t)
        number += 1

    ranking.sort(key=operator.itemgetter(1), reverse=True)

    #ELITE SELECTION

    fittest = list()
    for f in ranking[0:elite]:
        fittest.append(f[0])

    return fittest


def calculateComplexity(inputFile):

    #VORSICHT ANPASSEN
    inputFiles = getAllfiles("../results/cssValidator/Iteration-1/run-0/samples/", "css")
    inputFiles.sort()
    print(inputFiles)

    proc = subprocess.Popen(["java", "org.antlr.v4.gui.TestRig", "css3" , "main_dummy_rule_hope_for_no_collisions","-tree"] + inputFiles, stdout=subprocess.PIPE)

    output = proc.communicate()[0]

    #VROSICHT ANPASSEN
    inputFilesTrees = re.findall(r'main_dummy_rule_hope_for_no_collisions.+?nstylesheet', str(output))

    #Letzes Input File muss hinzugefügt werden
    lastElement = str(output).split('(main_dummy_rule_hope_for_no_collisions')[100]
    inputFilesTrees.append(lastElement)

    for x in inputFilesTrees:
        print("----------------------------------------")
        print(x)

    print("---------------------------------------- ANALYSE ----------------------------------------")

    ranking = list()
    i = 0
    for tree in inputFilesTrees:
        size = os.stat(inputFiles[i]).st_size
        if size != 0:
            n = tree.count(' (')
            fitness = n * (1.5 * n) / size
            print( "File: " + inputFiles[i] + "  Score: " + str(fitness))
            tuple = [inputFiles[i], fitness]
            ranking.append(tuple)
        else:
            fitness = 0

        print("File: " + inputFiles[i] + "  Score: " + str(fitness))
        tuple = [inputFiles[i], fitness]
        ranking.append(tuple)
        i += 1

    ranking.sort(key=operator.itemgetter(1), reverse=True)

    print("---------------------------------------- BEST ----------------------------------------")
    for x in ranking[0:10]:
        print(x[0])



def mainLoop():
    for x in range(1):
        calculateComplexity(x)

if __name__ == "__main__":
    mainLoop()


