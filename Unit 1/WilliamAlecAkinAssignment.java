//Import the necessary libraries to take user input
import java.util.Scanner;

public class WilliamAlecAkinAssignment {

    public static void main(String[] args) {
        //Create the code that takes in user input and name it "scanner"
        Scanner scanner = new Scanner(System.in);

        //I usually do this in my Python programs so I wanted to learn how to do it here and I hope it's ok!
        //This sets the variable "ANSI_RESET" to the corresponding ANSI code which resets terminal color to default
        String ANSI_RESET = "\u001B[0m";

        //This sets the variable "ANSI_BLUE" to the corresponding ANSI code which prints things as blue
        String ANSI_BlUE = "\u001B[34m";

        //This sets the variable "ANSI_GREEN" to the corresponding ANSI code which prints things as green
        String ANSI_GREEN = "\u001B[32m";

        //Print a message to standard out for the user prompt as blue and then reset terminal color to default
        System.out.println(ANSI_BlUE + "Please enter three numbers: " + ANSI_RESET);

        System.out.println("Please input the first number: ");
        //This line reads the first number number entered by the user and stores it in the firstNumber variable
        int firstNumber = scanner.nextInt();

        System.out.println("Please input the second number: ");
        //This line reads in the second number entered by the user and stores it in the secondNumber variable
        int secondNumber = scanner.nextInt();

        System.out.println("Please input the third number: ");
        //This line reads in the third number entered by the user and stores it in the thirdNumber variable
        int thirdNumber = scanner.nextInt();

        //This is left over from utilizing the example code in the assignment instructions
        //Read in the data entered by the user and assign it to a variable
        //String message = scanner.nextLine();

        //This line declares the "sum" variable as an integer and sets it equal to the sum of all three number variables
        int sum = firstNumber + secondNumber + thirdNumber;
        
        //This line declares the "average" variable as n integer and assigns it equal the the "sum" variable 
        //divided by the integer 3 to calculate the average
        int average = sum / 3;

        //This line prints the output of the sum variable combined with a descriptive text message to stdout in green text
        System.out.println(ANSI_GREEN + "The sum is: " + sum);

        //This line does what the line above does but instead prints the "average" variable and descriptive text
        System.out.println("The average is: " + average + ANSI_RESET);

        //This is left over from utilizing the example code in the assignment instructions
        //Print the message entered to standard out
        //System.out.println(message);
    }
}