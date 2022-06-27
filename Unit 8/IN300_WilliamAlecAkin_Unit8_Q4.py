'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 8 Assignment - Python Source Code
June 26th, 2022

Description: Write a Python program to plot a scatter chart using MatPlotLib from the "Demographic_Statistics_By_Zip_Code.csv" dataset file.
You will plot the count_female and count_male columns.

'''

# Import necessary libraries/modules
import pandas as pd
import matplotlib.pyplot as plt


# Read the data in with pandas
# Absolute file path may be necessary depending on circumstances
data = pd.read_csv('Demographic_Statistics_By_Zip_Code.csv')

# Remove sapces in column names
data.columns = data.columns.str.replace(" ", "_")

# Get the counts from the file to plot as a scatter plot
plt.scatter(data.COUNT_FEMALE, data.COUNT_MALE, s=200)

# Save the file to local disk
plt.savefig("IN300_WilliamAlecAkin_Unit8_Q4_Python.png")