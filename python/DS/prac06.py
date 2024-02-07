import pandas as pd
import numpy as np
import warnings
import seaborn as sns
from sklearn.datasets import fetch_openml
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import numpy as np


titanic = sns.load_dataset('titanic')
titanic.head()