# William "Alec" Akin
# IN300 - Programming for Data Analysis
# Purdue University Global
# Unit 2 Assignment
# May 8th, 2022
# Using VSCode on MacOS, "radian" as the shell
# https://github.com/rainmana/PUG-IN300-Unit2


# Prompt user to input a number between 1 and 100 and assign it to the variable "userNumber"
user_number <- readline(prompt="Please enter a number between 1 and 100: ")

# Validate that user_number is an integer or produce error message

# Convert the user's input to an integer
user_number <- as.numeric(user_number)

# Using IF/ELSE statements in R, determine a letter grade (A, B, C, D, F) based on value of user_number
if (user_number > 100){
  print("Invalid score. Please enter a value between 1 and 100 and try again.")
} else if (user_number < 0){
  print("Invalid score. Please enter a value between 1 and 100 and try again.")
} else if (user_number >= 90){
  print("The score you entered is an A.")
} else if (user_number >= 80){
  print("The score you entered is a B.")
} else if (user_number >= 70){
  print("The score you entered is a C.")
} else if (user_number >= 60){
  print("The score you entered is a D.")
} else {
  print("The score you entered resulted in an F.")
}


