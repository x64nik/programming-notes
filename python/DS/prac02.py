#!/usr/bin/python3

import pandas as pd
import numpy as np
import statistics as st
import warnings

warnings.filterwarnings('ignore')

data0 = pd.read_csv('loan_data.csv')


print(data0)
print(data0.sum())
print(data0.isnull().sum())
print(data0.describe())

cols = data0.columns


print(type(cols))

print("\n---------\n")

print(data0.median(axis=1))

print(data0.sample(10))

print(data0.std)

print("\nend\n")