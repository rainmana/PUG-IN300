#!/usr/bin/python3

'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 7 Assignment - Python Source Code
June 19th, 2022

Description: Write a Python program which completes the following:
1. Read in IN300_Dataset2.txt  using NumPy
2. Using the data read in from the text file, create a two-dimensional array that is 2,500 rows by 100 columns
3. Also create a three-dimensional array that is 2,500 by 10 by 10
4. Slice the two-dimensional array using a starting index of 2, an ending index of 5, and steps by 10
5. Print the results of the slice

'''

# Import the necessary libraries
import numpy as np

# Read in the file IN300_Dataset2.txt with numpy
# Specify absolute path to file to avoid errors
data = np.loadtxt('/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt', delimiter = ' ', dtype = int)

# Create the two-dimensional array/matrix by reshaping the data frame
matrix_2d = data.reshape(2500,100)

# Print the results of the maxtrix to stdout with a message
print("The two-dimensional array/matrix is: \n")
print(matrix_2d)

# Reshape the data to a three-dimensional array/matrix
matrix_3d = data.reshape(2500,10,10)

# Print the results of the three-dimensional array/matrix to stdout with a message
print("The three-dimensional array/matrix is: \n")
print(matrix_3d)

# Slice by the 2nd and 5th index and steps of 10 of the two-dimensional array/matrix
slice = matrix_2d[2:5:10, :]

# Print the results of the slice to stdout with a message
print("The slice is: \n")
print(slice)