'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 8 Assignment - Python Source Code
June 26th, 2022

Description: Wrte a Python program to plot a bar chart using MatPlotLib and the average for the
"Average_Daily_Traffic_Counts.csv" dataset file. Be sure to get the Mean of the dataset. For example,
data.mean(axis = 0) would return the mean of the dataset for each column. (Hint: data is in the Pandas dataframe)

'''

# Import required modules and libraries
import pandas as pd
import matplotlib.pyplot as plt


# Read in the file Average_Daily_Traffic_Counts.csv with pandas
data = pd.read_csv('Average_Daily_Traffic_Counts.csv')

# Get the mean of the data
result = data.mean(axis = 0)

# Plot the mean values of the data set
result.plot(kind = 'bar')

# Display the bar chart
plt.savefig("IN300_WilliamAlecAkin_Unit8_Q3_Python.png")