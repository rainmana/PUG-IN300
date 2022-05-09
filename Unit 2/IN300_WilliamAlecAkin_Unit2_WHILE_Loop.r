# William Alec Akin
# Purdue University Global
# IN300 - Programming for Data Analaysis (Python, R, Java)
# Dr. Robert Kayl
# Unit 2 Assignment - WHILE Loop - R Source Code
# May 8th, 2022

# List of book categories for menu:
# 1. Science Fiction
# 2. Computers and Technology
# 3. Cooking
# 4. Business
# 5. Comics
# 6. Exit

#Psudo-code for R:
# 0. Print a welcome message to the user
# 1. Use while loop to iterate through the menu options and print to stdout
# 2. Ask the user to choose an integer between 1 and 6
# 3. Based on the user's choice, output the categor and a complimentary message
# 4. Return the user to the menu to chose another category or exit

# Print a welcome message to the user
print("Welcome to the book category menu!")

# Use while loop to iterate through the menu options and print to stdout
while (TRUE) {
    # Ask the user to choose an integer between 1 and 6
    print("Please choose a category:")
    print("1. Science Fiction")
    print("2. Computers and Technology")
    print("3. Cooking")
    print("4. Business")
    print("5. Comics")
    print("6. Exit")

    # Ask for user's input
    user_input <- readline(prompt = "Please enter a number between 1 and 6: ")

    # Convert the user's input to an integer
    user_input <- as.numeric(user_input)

    # Based on user's choice, output the category and a complimentary message
    # Final else statement performs error validation
    if (user_input == 1) {
        print("You have chosen Science Fiction.")
        print("Science Fiction is a genre of fiction in which imaginative fiction is set in a fictional universe.")
    } else if (user_input == 2) {
        print("You have chosen Computers and Technology.")
        print("Computers and Technology is about the use of computers and technology to solve problems.")
    } else if (user_input == 3) {
        print("You have chosen Cooking.")
        print("Cooking is the art of preparing food.")
    } else if (user_input == 4) {
        print("You have chosen Business.")
        print("Business is the business of doing business.")
    } else if (user_input == 5) {
        print("You have chosen Comics.")
        print("Comics is a genre of literature that portrays images and stories in comic strips.")
    } else if(user_input == 6) {
        print("You have chosen to exit the program.")
        print("Thank you for using the book category menu!")
        break
    } else {
        print("Invalid input. Please enter a number between 1 and 6.")
    }
}