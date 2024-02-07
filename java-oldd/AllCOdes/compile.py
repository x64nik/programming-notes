#!/usr/bin/python3

import os
import sys

def compile(filename):
	print("--- :) compiler running (: ---\n")
	os.system("javac " + filename)
	os.system("java " + filename[:-5])


if __name__ == '__main__':

	try:
		file = sys.argv[1]
		compile(file)
	except IndexError:
		print("Usage: ./compile.py <filename.java>")
