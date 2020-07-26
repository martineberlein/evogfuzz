import os
import glob


colors = {"blue": '\033[94m', "green": '\033[92m', "red": '\033[91m', "reset": '\033[0m'}


def error(message):
    print(colors["red"] + "[ERROR]" + colors["reset"] + message)


def info(message):
    print(colors["blue"] + "[INFO] " + colors["reset"] + message)


def getAllfiles(fileLocation, extension):
    files = "*." + extension

    iter_files = fileLocation + "/" + files
    itemlist = glob.glob(iter_files)
    return itemlist


def removesSetFromList(seedlist , items):
    for i in items:
        seedlist.remove(i)
    temp = seedlist
    return temp
