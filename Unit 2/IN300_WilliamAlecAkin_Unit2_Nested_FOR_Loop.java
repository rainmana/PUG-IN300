/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analaysis (Python, R, Java)
Dr. Robert Kayl
Unit 2 Assignment - Nested FOR Loop - Java Source Code
May 8th, 2022
*/

/*
Instructions:
Write a Java program that uses two nested FOR loops. 
The values used in the outer loop will be a user input value.
The inner loop will use the input value divided by 2. 
Print a simple statement showing the values using the range of 1 to the user input number in the outer loop.
The inner loop will print 1 to the divided result. 
Ensure each line of code is commented and lines are properly indented
*/

//Import the scanner library
import java.util.Scanner;

public class IN300_WilliamAlecAkin_Unit2_Nested_FOR_Loop {
    public static void main(String[] args) {

        //Prompt the user for a number between 1 and 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        String input = sc.nextLine();

        //Close the scanner object
        sc.close();

        //Convert the input to an integer value and set it to a variable named internalNumber
        int internalNumber = Integer.parseInt(input);

        //Initailize the generatedNumber as an int and make it equal to internalNumber divided by 2
        int generatedNumber = internalNumber / 2;

        //Nested loop section

        //Use an if statement to validate whether the internalNumber is greater than or equal to 1 and less than or equal to 10
        if (internalNumber >= 1 && internalNumber <= 10) {

            //Outer loop uses the internalNumber
            for (int i = 1; i <= internalNumber; i++) {
                //Print the outer loop value as a message to stdout
                System.out.println("The value of the outer loop is: " + i);

                //Inner loop uses uses user input number divided by 2
                for (int j = 1; j <= generatedNumber; j++) {
                    //Print the inner loop value as a message to stdout
                    System.out.println("The value of the inner loop is: " + j);

                }

                //Print blank line to stdout
                System.out.println("");

            }

        }
    }
    
}
