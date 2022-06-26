# W. Alec Akin
# IN300 Programmging for Data Analysis (R, Python, Java)
# Dr. Robert Kayl
# Unit 7 Assignment - R Source Code
# Description: Write an R program that does the following:
#   a. Reads in the IN300_Dataset2.txt file
#   b. Using that data, create a two-dimensional array that is 2,500 rows by 100 columns
#   c. Also create a three-dimensional array using a start column index of 2, end of 5
#   d. Print the results of the arrays and slice

# Read in the IN300_Dataset2.txt file
data <- scan("/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt")

# Create a two-dimensional matrix of 2500 rows by 100 columns
my2dMatrix <- matrix(data, nrow = 2500, ncol = 100)

# Print the two dimensional matrix
print(my2dMatrix)

# Create a three-dimensional array that is 2500 by 10 by 10
my3dArray <- array(data, dim = c(2500,10,10))

# Print the three-dimensional array
print(my3dArray)

# Slice the 2d array starting at index 2 and ending at index 5
# Then, print the results
print(my2dMatrix[,2:5])