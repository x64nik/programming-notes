#!/usr/bin/python3


import pandas as pd
import numpy as np
import statistics as st
import warnings
from sklearn.datasets import load_boston
#import matplotlib.pyplot as plt

warnings.filterwarnings('ignore')

data0 = pd.read_csv('./dataset/loan_data.csv')
data1 = pd.read_csv('./dataset/vehicles.csv')
data2 = pd.read_csv('./dataset/Salary_Data.csv')
data3 = pd.read_csv('./dataset/Social_Network_Adds.csv')

print(data0)

print(data0.sum())

print(data0.isnull	().sum())

print(data0.describe())

cols = data0.columns

print(type(cols))

print("\n---------\n")

print(data0.median(axis=1))

print(data0.sample(10))

print(data0.std)

print(data1.rank())
print(data3.info())
# plt.scatter(data1[0],data1[1])
# plt.scatter(dataset[[0]],dataset[[1]])
# plt.show()
# plt.plot()

x = data0.iloc()
print(x)



print("\nend\n")

