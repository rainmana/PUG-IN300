'''William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - Python Source Code
May 1st, 2022'''


# Import required libraries
from ast import Or
from colorama import Fore,Style,init
import sys

# Declare necessary variables; grade for letter grade, color for corresponding grade color, and indefinite article
score = 0
color = ""
indefArticle = ""
grade = ""

# Declare text formatting variables and config
init(autoreset=True)
bold = Style.BRIGHT
errorColor = Fore.RED
reset = Style.RESET_ALL


# Ensure score remains the correct data type (not worried about the other two as string values)
score = int(score)


# Prompt the user to enter a value between 0 and 100 and quite if they enter anything else using a try/except block
try:
    score = int(input(bold + "\n\nPlease enter a score to receive the corresponding letter grade: "))  
except:
    print(errorColor + bold + "\nYou did not enter a valid number (0-100). Please try again.")
    sys.exit()

# Validate the user entered a score between 0 and 100 with a simple if statement. Closes program if data doesn't meet criteria
if score < 0 or score > 100:
        print(errorColor + bold + "\nYou did not enter a valid number (0-100). Please try again with a valid number.")
        sys.exit()

# Code used for debugging
#print(Style.DIM + "The data type of 'score' is ", type(score))


# Usine IF/ELIF/ELSE logic to produce the corresponding letter grade, indefinite article, and color for output
if score >= 90:
    grade = "A"
    color = Fore.GREEN
    indefArticle = "an "

elif score >= 80:
    grade = "B"
    color = Fore.BLUE
    indefArticle = "a "

elif score >= 70:
    grade = "C"
    color = Fore.YELLOW
    indefArticle = "a "

elif score >= 60:
    grade = "D"
    color = Fore.MAGENTA
    indefArticle = "a "

else:
    grade = "F"
    color = Fore.RED
    indefArticle = "an "

# Creates a new variable called printScore. Since score is an int data type, it can't be concatenated with "+" so we need a string alternative
# I could just assign "grade" as a string, but want to keep things intact in case I add code later
printScore = score
printScore = str(printScore)


# Print final statement to stdout with number entered, corresponding letter grade, proper indefArticle, and color
print("\nBased on the entered score, " + color + bold + printScore + reset + ", your letter grade is " + indefArticle + color + bold + grade + reset + ".\n")
