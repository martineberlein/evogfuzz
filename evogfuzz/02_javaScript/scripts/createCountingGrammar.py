import util
import os
import subprocess
import glob
from shutil import copyfile

"""
Absolute Paths, be careful 
"""

def createCountingGrammar(grammarName):
    util.info("Creating Couting grammar from .bnf")
    grammarLocation = "./bnf/" + grammarName + ".bnf"
    gfile = grammarName + ".g4"
    outputGrammar = os.path.join(os.getcwd(),"antlrCountingGrammar", gfile)

    f = open(outputGrammar, "w")
    header ="asdasd"
    f.write(header)

    subprocess.call(["java", "-jar", "./tools/countingGrammar.jar", grammarLocation], stdout=f)
    copyfile(outputGrammar, "antlrParser/arithmetic.g4")
    util.info("Done")
    compileCountingGrammar(outputGrammar)

def compileCountingGrammar(outputGrammer):
    util.info("Creating ANTLR Parser")
    subprocess.call(["java", "org.antlr.v4.Tool", "./antlrParser/arithmetic.g4"])
    util.info("Done")

    java_files = glob.glob("./antlrParser/*.java")
    arguments = ["javac"] + java_files
    subprocess.call(arguments)
