# William Alec Akin
# Purdue University Global
# IN300 - Programming for Data Analaysis (Python, R, Java)
# Dr. Robert Kayl
# Unit 2 Assignment - Nested FOR Loop - R Source Code
# May 8th, 2022

# Instructions:
# Write a program with the R langue that uses two nested FOR loops.
# The values used in the outer loop will be a user input value.
# The inner loop will use the input value divided by 2.
# Print a simple statement showing the values using the
# range of 1 to the user input number in the outer loop.
# The inner loop will print 1 to the divided result.
# Ensure each line of code is commented and lines are properly indented

# Create the internalNumber variable as an integer and set it equal to user input
internalNumber <- as.integer(readline(prompt = "Please enter a number: "))

# Set the generatedNumber variable as an integer and set it equal to the user input divided by 2
generatedNumber <- as.integer(internalNumber / 2)

# Ensure generatedNumber is an integer
generatedNumber <- as.integer(generatedNumber)

# This section includes the nested FOR loop
# Use an if statement to check if the internalNumber is greater than or equat to 1 and less than or equal to 10
# If it is, then run the FOR loop
if (internalNumber >= 1 && internalNumber <= 10) {
    for (i in 1:internalNumber) {
        # Print blank lines between each iteration of the outer loop
        print("---")
        # Print the value of i in the outer loop with a statement to user out
        print(paste("The outerloop value is: ", i))

        # Inner loop
        for (j in 1:generatedNumber) {
            # Print blank lines between each iteration of the inner loop
            print("---")
            # Print the value of j in the inner loop with a statement to user out
            print(paste("The inner loop value is: ", j))
        }
    }
} else {
    # Print an error message if the user input is not between 1 and 10
    print("Please enter a number between 1 and 10.")
    # Quit the script
    quit()
}