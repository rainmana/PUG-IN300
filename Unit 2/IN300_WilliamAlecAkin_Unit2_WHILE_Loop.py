''' William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - WHILE Loop - Python Source Code
May 8th, 2022
'''

''' List of book categories for menu:
1. Science Fiction
2. Computers and Technology
3. Cooking
4. Business
5. Comics
6. Exit
'''

'''
Psudo-code:
1. Use while loop to iterate through the menu options and print to stdout
2. Ask the user to choose an integer between 1 and 6
3. Based on the user's choice, output the categor and a complimentary message
4. Return the user to the menu to chose another category or exit
'''

# Import the necessary libraries
import sys
import colorama
from colorama import Fore, Style

# Inistalize colorama and set autoreset to True
colorama.init(autoreset=True)


# Print welcome message to the user using colorama for color
print(Style.BRIGHT + colorama.Fore.GREEN + 'Welcome to the book category menu!\n')
print(colorama.Fore.RESET)


# Use a while loop to iterate through the menu options and print to stdout
while True:
    print("1. Science Fiction")
    print("2. Computers and Technology")
    print("3. Cooking")
    print("4. Business")
    print("5. Comics")
    print("6. Exit")
    userInput = int(input(Style.BRIGHT + Fore.YELLOW + 'Please select a number between 1 and 6 for the menu options: ' + Fore.RESET + Style.RESET_ALL))

    # Based on the user's choice, output the categor and a complimentary message
    # This will output all selections in a different color as well
    if userInput == 1:
        print(Fore.GREEN + '\nYou have selected Science Fiction!\n')
        print(Fore.GREEN + 'You should read a book in this category!\n')
        print(Fore.RESET)
    elif userInput == 2:
        print(Fore.CYAN + '\nYou have selected Computers and Technology!\n')
        print(Fore.CYAN + 'You should read a book in this category!\n')
        print(Fore.RESET)
    elif userInput == 3:
        print(Fore.YELLOW + '\nYou have selected Cooking!\n')
        print(Fore.YELLOW + 'You should read a book in this category!\n')
        print(Fore.RESET)
    elif userInput == 4:
        print(Fore.MAGENTA + '\nYou have selected Business!\n')
        print(Fore.MAGENTA + 'You should read a book in this category!\n')
        print(Fore.RESET)
    elif userInput == 5:
        print(Fore.RED + '\nYou have selected Comics!\n')
        print(Fore.RED + 'You should read a book in this category!\n')
        print(Fore.RESET)
    elif userInput == 6:
        print(Fore.GREEN + '\nYou have selected Exit!\n')
        print(Fore.GREEN + 'Thank you for using the book category menu!\n')
        print(Fore.RESET)
        sys.exit()
