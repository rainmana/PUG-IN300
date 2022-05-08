'''William Alec Akin
IN300 Programming for Data Analysis
Unit 1 Assignment
Python Portion
April 28th, 2022'''

#Import an extra library to add color like java
from colorama import Fore, Style

#Print a welcome statement to the user in the color blue and reset terminal to default color scheme
print(Fore.BLUE + "\n\nWelcome to Alec's simple sum and average calculator!" + Style.RESET_ALL)

#Prompt user for input of first number and assign to variable with a floating point data type that allows decimals
firstNumber = input("Please enter the first number: ")
firstNumber = float(firstNumber)

#Prompt user for input of second number and assign to variable with a floating point data type that allows decimals
secondNumber = input("Please enter the second number: ")
secondNumber = float(secondNumber)

#Prompt the user for input of third number and assign to variable with a floating point data type that allows decimals
thirdNumber = input("Please enter the third number: ")
thirdNumber = float(thirdNumber)

#Define the "sum" variable and make it equal to the sum of all three numbers entered by the user
sum = firstNumber + secondNumber + thirdNumber

#Defind the "average" variable and make it equal to the average of all three numbers entered by the user
average = sum / 3

#Print the sum of all three numbers in the color green
print(Fore.GREEN + "The sum of all three numbers is:", sum)

#Print the average of all three numbers in the color green and reset the terminal to default color scheme
print("The average of all three numbers is:", average, Style.RESET_ALL)