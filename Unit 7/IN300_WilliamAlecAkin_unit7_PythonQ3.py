'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 7 Assignment - Python Source Code
June 19th, 2022

Description: Write a Python program which completes the following:
1. Read in IN300_Dataset2.txt  using NumPy
2. Using meaningful statments and NumPy and SciPy, calculate and print the following:
    a. The mean of the data
    b. The median of the data
    c. the mode of the data
    d. The standard deviation of the data
'''

# Import required modules
# Note for Dr. Kayl: 'stats' is a submodule of the 'scipy' module now (it looks like) so I had to use 'scipy.stats' to get this to work
# Not sure if other students had the same issue, but wanted to let you know!
import numpy as np
from scipy import stats

# Read in the file IN300_Dataset2.txt with numpy
# Specify as full path to avoid errors
data = np.loadtxt('/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt', delimiter = ' ', dtype = int)

# Print the mean to stdout with a message
print("\nThe mean of the data is: ")
print(np.mean(data))

# Print the median to stdout with a message
print("\nThe median of the data is: ")
print(np.median(data))

# Calculate the mode of the data using SciPy
mode = int(stats.mode(data)[0])

# Print the mode to stdout with a message
print("\nThe mode of the data is: ")
print(mode)

# Print the standard deviation to stdout with a message
print("\nThe standard deviation of the data is: ")
print(np.std(data))