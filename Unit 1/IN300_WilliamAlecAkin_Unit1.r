# William "Alec" Akin
# IN300 - Programming for Data Analysis
# Purdue University Global
# Unit 1 Assignment
# April 30th, 2022
# Using https://codio.io


# Welcome the user to the R-based sum and average calculator and explain use
print("Welcome to Alec's sum and average calculator!")
print("You will enter three numbers and the calculator will return the sum and average of those numbers.")

# Prompt the user to insert a first, second, and third number
firstNumber <- readline(prompt="Please enter the first number: ")
secondNumber <- readline(prompt="Please enter the second number: ")
thirdNumber <- readline(prompt="Please enter the third number: ")

# Convert the datatypes of the three variables from "char" to "numbers/double"
firstNumber <- as.numeric(firstNumber)
secondNumber <- as.numeric(secondNumber)
thirdNumber <- as.numeric(thirdNumber)

# Sum the three numbers together and assign them to a new variable "sum"
sum <- firstNumber + secondNumber + thirdNumber

# Average the three numbers by dividing "sum" by "3"
average <- sum/3

# Print the sum to stdout with the "cat" function
cat("The sum of all three numbers is: ", sum)

# Print the average of the three numbers to stdout with the "cat" function
cat("\nThe average of all three numbers is: ", average)
