'''William Alec Akin
IN300 - Programming for Data Science
Purdue University Global
Unit 2 DB Post 2 - Initial Post
May 1st, 2022
https://alecakin.com/about
https://github.com/rainmana'''



# Import libraries to make this easier to follow along
import time
from colorama import Fore,Style,init

# Apply colorama auto reset to increase code readbility and library ease of use
init(autoreset=True)

# Declare variables and assign sample data to them
swPlanets = ['Tatooine','Alderaan','Dagobah','Endor','Hoth','Kashyyk','Mustafar','Naboo','Coruscant']
exampleNumber = 0

# Print the swPlanets list to standard out. User prompt is in 'green' and 'RESET' resets terminal back to default
time.sleep(2)
print(Fore.GREEN + Style.BRIGHT + "If we print a list in Python, it's going to give us some weird output like so:")
time.sleep(2)
print(swPlanets)
time.sleep(2)

# Print swPlanets list to stdout with a "for" loop to show how it can dramatically improve readability (as example)
# Added 'time.sleep(n)' which makes the text more readable and easier to follow along
# Added color to differentiate prompts and increase readability using Colorama library for color/text style
print(Fore.GREEN + Style.BRIGHT + "\n\nWhat if we wanted to only print one planet at a time? Just for readability, or we wanted to look for a particular planet?")
time.sleep(2)
print(Fore.GREEN + Style.BRIGHT + "We do this with a for loop of course!")
time.sleep(2)

# Now we print some sample code to stdout which is very similar to what's actually used in this program
print(Fore.YELLOW + "\n\nSample code:")
time.sleep(2)

print('''for planet in swPlanets:
            print(planet)\n\n''')
time.sleep(2)

print(Fore.YELLOW + "Which will produce this:")
time.sleep(2)

# This is the actual 'for' loop that prints the planets one by one but slows down printing by sleeping 1 second each iteration
for planet in swPlanets:
    print(planet)
    time.sleep(0.5)
time.sleep(2)

# Display message preparing for 'while' loop example
print(Fore.GREEN + Style.BRIGHT + "\n\nNow, what if we wanted to count up to 5, but no further for some reason? How would we do that?")
time.sleep(2)
print(Fore.GREEN + Style.BRIGHT + "With a 'while' loop of course!\n")
time.sleep(2)

# Now we print some sample code to stdout which is very similar to what's actually used in this program
print(Fore.YELLOW + "Sample code:")
time.sleep(2)

print('''while sampleNumber <=5:
            print(sampleNumber)
            sampleNumber +=1''')

print(Fore.YELLOW + "\nWhich will produce this:")
time.sleep(2)

while exampleNumber <= 5:
    print(exampleNumber)
    time.sleep(0.5)
    exampleNumber +=1
time.sleep(2)

# Print the final output, as well as feedback on how the 'while' loop functions
print(Fore.GREEN + Style.BRIGHT + "\nYay! We did it! And, because of that 'while' loop, we stopped at '5' instead of counting forever!")
time.sleep(1)
print(Fore.GREEN + Style.BRIGHT + "I hope this helped!")


