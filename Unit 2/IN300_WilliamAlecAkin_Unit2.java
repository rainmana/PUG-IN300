/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - Java Source Code
May 1st, 2022
*/

//Import necessary libraries
import java.util.Scanner;

//Create main Java class where all the magic happens
public class IN300_WilliamAlecAkin_Unit2 {
    public static void main(String[] args) 
    {
        //Define variables to contain letter grade character and int for score
        int score;
        String grade;
        String color;
        String indefiniteArticle;

        //Create the code that takes in user input from stdin
        Scanner scanner = new Scanner(System.in);

        //Create variables which allow use of simple ANSI_COLOR references instead of the codes themselves
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001b[33m";
        String ANSI_MAGENTA = "\u001b[35m";
        String ANSI_CYAN = "\u001b[36m";
        String ANSI_RED = "\u001b[31m";
        
        //Create variables to hold ANSI codes for text style (Bold, Underline)
        String ANSI_BOLD = "\u001b[1m";
        String ANSI_UNDERLINE = "\u001b[4m";
        
        //Prompt the user to enter a score between 0 and 100
        System.out.println(ANSI_GREEN + "This program calculates a grade based on a score entered.");
        System.out.println(ANSI_BLUE + "Please enter a grade score between 0 and 100: " + ANSI_RESET);

        //Assign the users' entered score value to an integer variable
        score = scanner.nextInt();

        //Use IF/ELSE IF/ELSE statements to print the appropriate score based on grade enter by the user
        //Additionally, I've added a color variable to set depending on what the grade as well as the proper "indefinite article"
        if (score >= 90)
        {
            grade = "A";
            color = ANSI_GREEN;
            indefiniteArticle = "an ";
        }
        else if (score >= 80)
        {
            grade = "B";
            color = ANSI_BLUE;
            indefiniteArticle = "a ";
        }
        else if (score >= 70)
        {    
            grade = "C";
            color = ANSI_YELLOW;
            indefiniteArticle = "a ";
        }
        else if (score >= 60)
        {
            grade = "D";
            color = ANSI_MAGENTA;
            indefiniteArticle = "a ";
        }
        else
        {
            grade = "F";
            color = ANSI_RED;
            indefiniteArticle = "an ";
        }

        //Now we print the score's corresponding letter grade for the user to stdout
        System.out.println("Based on the entered score " + color + ANSI_BOLD + ANSI_UNDERLINE + score + ANSI_RESET + ", your letter grade is " + indefiniteArticle + color + ANSI_BOLD + ANSI_UNDERLINE + grade+ ANSI_RESET + "." );
    }

    
}
