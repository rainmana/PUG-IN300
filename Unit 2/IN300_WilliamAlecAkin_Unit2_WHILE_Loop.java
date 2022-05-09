/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - WHILE Loop - Java Source Code
May 8th, 2022
*/

/* List of book categories for menu:
1. Science Fiction
2. Computers and Technology
3. Cooking
4. Business
5. Comics
6. Exit
*/

/*
Psudo-code:
1. Use while loop to iterate through the menu options and print to stdout
2. Ask the user to choose an integer between 1 and 6
3. Based on the user's choice, output the categor and a complimentary message
4. Return the user to the menu to chose another category or exit
*/

//Import necessary libraries
import java.util.Scanner;

//Create main Java class where all the magic happens
public class IN300_WilliamAlecAkin_Unit2_WHILE_Loop {
    public static void main(String[] args) 
    {
        //Create scanner object to read in user input
        Scanner scanner = new Scanner(System.in);

        // Define ANSI color codes equal to variables to make them easier to use
        //Create variables which allow use of simple ANSI_COLOR references instead of the codes themselves
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001b[33m";
        String ANSI_MAGENTA = "\u001b[35m";
        String ANSI_CYAN = "\u001b[36m";
        String ANSI_RED = "\u001b[31m";

        //Define variables to create a counter for the while loop
        //int counter = 0;
        int choice = 0;

        //Print welcome statement to stdout
        System.out.println(ANSI_GREEN + "Welcome to the book category menu!" + ANSI_RESET);

        //Use a while loop to iterate through the menu options and print to stdout and iterate the counter by 1
        while (true){
            System.out.println("1. Science Fiction");
            System.out.println("2. Computers and Technology");
            System.out.println("3. Cooking");
            System.out.println("4. Business");
            System.out.println("5. Comics");
            System.out.println("6. Exit");
            //counter++;
            
            //Prompt the user to enter a number between 1 and 6 and assign it to the choice variable
            System.out.println(ANSI_BLUE + "Please enter a number between 1 and 6: " + ANSI_RESET);
            choice = scanner.nextInt();
            System.out.println();

            //Use IF/ELSE IF/ELSE statements to print the appropriate category and message based on the user's choice
            if(choice == 1)
            {
                System.out.println(ANSI_MAGENTA + "You chose Science Fiction!");
                System.out.println("You are a fan of science fiction!" + ANSI_RESET);
                System.out.println();
                System.out.println();
            }
            else if(choice == 2)
            {
                System.out.println(ANSI_CYAN + "You chose Computers and Technology!");
                System.out.println("Computers and Technology is the study of computers and their applications." + ANSI_RESET);
                System.out.println();
                System.out.println();
            }
            else if (choice == 3)
            {
                System.out.println(ANSI_YELLOW + "You chose Cooking!");
                System.out.println("Cooking is the art of preparing food." + ANSI_RESET);
                System.out.println();
                System.out.println();
            }
            else if (choice == 4)
            {
                System.out.println(ANSI_RED + "You chose Business!");
                System.out.println("Business is the study of the business world." + ANSI_RESET);
                System.out.println();
                System.out.println();
            }
            else if (choice == 5)
            {
                System.out.println(ANSI_BLUE + "You chose Comics!");
                System.out.println("Comics is the study of comic books." + ANSI_RESET);
                System.out.println();
                System.out.println();
            }
            else if (choice == 6)
            {
                System.out.println(ANSI_GREEN + "You chose to exit the program!");
                System.out.println("Thank you for using the program!" + ANSI_RESET);
                System.out.println();
                System.out.println();
                break;
            
        }
    }
}
}
