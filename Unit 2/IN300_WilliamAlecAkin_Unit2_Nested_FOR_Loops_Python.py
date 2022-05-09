''' William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - Nested FOR Loop - Python Source Code
May 8th, 2022
'''

'''Instructions:
Write a Python program that uses two nested FOR loops. 
The values used in the outer loop will be a user input value.
The inner loop will use the input value divided by 2. 
Print a simple statement showing the values using the range of 1 to the user input number in the outer loop.
The inner loop will print 1 to the divided result. 
Ensure each line of code is commented and lines are properly indented'''

# Import libraries
import sys
from colorama import init, Fore, Style
import colorama
import time

# Initialize colorama
init()

# Set colorama to autoreset at the end of each line
colorama.init(autoreset=True)

# Prompt the user for input and assign it to the variable "internalNumber"
internalNumber = int(input(Style.BRIGHT + Fore.GREEN + "Please enter a number between 1 and 10: "))

# Set the generatedNumber variable equal to the internalNumber variable divided by 2
generatedNumber = internalNumber / 2

# Ensure generatedNumber is an integer
generatedNumber = int(generatedNumber)

# This section includes the nested FOR loop
# Use an If statement to check if internalNumber is greater than or equal to 1 and less than or equal to 10
if internalNumber >= 1 and internalNumber <= 10:
    for i in range(1, internalNumber + 1):
        # Print blank lines to create a space between the outer loop and the inner loop
        print()
        # Sleep for 1 second
        time.sleep(1)
        print(Fore.YELLOW + "The outerloop values is: ", i)
        
        # Inner loop
        for j in range(1, generatedNumber + 1):
            # Print blank lines to create a space between the outer loop and the inner loop
            print()
            # Sleep for 1 second
            time.sleep(1)
            print(Fore.CYAN + "The innerloop values is: ", j)
else:
    print(Style.BRIGHT + Fore.RED + "You did not enter a value between 1 and 10. Please try again.")
    sys.exit()

