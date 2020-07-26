#!/usr/bin/env python
from __future__ import print_function
from __future__ import division

import glob
import os
import subprocess
import shutil

#dir = "./IFH"
from builtins import range

mainDir = "./results/"


def exec_files(run):
    subjects = ['Rhino']

    for sub in subjects:

        dir = mainDir + sub + "/"

        output = dir + "Iteration-" + str(run) + "/results" + sub + ".csv"
        input = dir + "Iteration-" + str(run) + "/"
        print("Teste mit generierten Tests " + sub)
        subprocess.call(["java", "-jar", "./tools/coverage-drivers-1.0-SNAPSHOT.jar", sub, "file-coverage-all", input,
                         output])
        print("Tests abgeschlossen")


def copy_all(files):
    for f in files:
        shutil.copy2(f, "./results")


if __name__ == "__main__":
    baseDirectory = os.path.join(os.getcwd(), "output")
    for i in range(1,2):
        exec_files(i)


