import pandas as pd
import numpy as np
import warnings
import seaborn as sns
from sklearn.datasets import fetch_openml
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import numpy as np

sns.set_style('dark')

Data = pd.read_csv('./dataset/loan_data.csv')
housing = fetch_openml(name="house_prices", as_frame=True)

warnings.filterwarnings('ignore')

from sklearn.datasets import fetch_california_housing
housing = fetch_california_housing()

print(housing.keys())

boston = pd.DataFrame(housing.data)
boston.columns = housing.feature_names

boston['Price'] = housing.target
print(boston.head())
print(boston.info())
print(boston.describe())

sns.heatmap(boston.corr())
sns.displot(boston['Price'])

# plt.show()

x = boston.drop('Price',axis=1)
y = boston['Price']
print("------> " + str(type(x)))
print("-------> " + str(type(y)))

LR = LinearRegression()
LR.fit(x, y)
print(LR.score(x, y))

inter = LR.intercept_

pred = LR.predict(x)

plt.scatter(y, pred)
plt.xlabel('price')
plt.ylabel('predectedPrice')
plt.show()


 	 	

