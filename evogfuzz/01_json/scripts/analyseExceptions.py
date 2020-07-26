#!/usr/bin/env python
from __future__ import print_function

import glob
import os
import subprocess
import sys
import tempfile
import random
import optparse
import operator
from random import randrange
import re

import json


def getAllfiles(fileLocation, extension):

    files = "*." + extension

    #iter_files = fileLocation + "/*/" + files
    iter_files = fileLocation + "/*/" + files

    itemlist = glob.glob(iter_files)
    return itemlist

def addExceptionsGlobalList(exceptions):
    for exception in exceptions:
        if exceptionsGlobal.count(exception) > 0:
            exceptionDictGlobal[exception] = exceptionDictGlobal[exception] +1
        else:
            exceptionsGlobal.append(exception)
            exceptionDictGlobal[exception] = 1


def getExceptions(iteration):

    exceptionFiles = getAllfiles("./results/" + subject + "/Iteration-" + str(iteration) +"/", "exceptions")

    exceptions = list()
    for x in exceptionFiles:

        with open(str(x), "r") as read_file:
            developer = json.load(read_file)


            for dev in developer:
                if(exceptions.count(dev['name']) == 0):
                    exceptions.append(dev['name'])


    return exceptions


def printResults():

    print("--------------------------------------")
    for key in exceptionDictGlobal:
        print(str(key) + " : " + str(exceptionDictGlobal[key]) + " / 30")

    print("--------------------------------------")


if __name__ == "__main__":
    # Parser Options
    parser = optparse.OptionParser()
    parser.add_option("-p", "--inputDir", type="string", dest="inputDir")
    parser.add_option("-s", "--subject", type="string", dest="sub")
    (options, args) = parser.parse_args()

    baseDirectory = os.path.join(os.getcwd(), str(options.inputDir))
    subject = options.sub

    exceptionsGlobal = list()

    exceptionDictGlobal = {}

    for iteration in range(1,31):
        exceptions = getExceptions(iteration)
        addExceptionsGlobalList(exceptions)


    #print(exceptionDictGlobal)
    printResults()



