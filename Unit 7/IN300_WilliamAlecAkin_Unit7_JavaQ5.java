/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 7 Assignment - Java Source Code (Mean, median, mode, standard deviation)

Description:
Write a Java program that does the following:
1. Reads in the text file IN300_Dataset2.txt
2. Using that data, creates a two-dimensional array that is 2,500 rows by 100 columns
3. Slices the two-dimensional array using a starting column index of 2 and an ending column index of 5
4. Prints the restuls of the arrays and slice.

*/

//Import necessary libraries
import java.util.*;
import java.io.File;


public class IN300_WilliamAlecAkin_Unit7_JavaQ5 {

    public static void main(String[] args) {
        
        try {

            //Create a two-dimensional array that is 2,500 rows by 100 columns
            int cols = 2500;
            int rows = 100;
            int[][] my2dArray = new int[cols][rows];

            //Read in IN300_Dataset2.txt - may need full file path if there are issues with loading it
            Scanner scanner = new Scanner(new File("/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt"));

            //Fill the two-dimensional array with the values from the text file
            while(scanner.hasNextInt()){
                for(int i = 0; i < cols; i++) {
                    for(int j = 0; j < rows; j++) {
                        my2dArray[i][j] = scanner.nextInt();
                    }
                }
            }

            //Copy a slice of the array
            int[][] newArray = Arrays.copyOfRange(my2dArray, 2,5);

            for(int[] row : newArray) {
                System.out.println(Arrays.toString(row));
            }

            //This is the placeholder for the slice
            int[][] myNewArray = new int[3][];

            //Print the results of the slice
            for(int i = 2, j=0; i < 5; i++, j++) {
                myNewArray[j] = Arrays.copyOfRange(my2dArray[i], 2,5);
                System.out.println(Arrays.toString(newArray[j]));
            }

            //Close the scanner
            scanner.close();

        }

        //Catch any expections
        catch(Exception e) {
            System.out.println("There was an error. Please try again." + e.getMessage());
        }
    }
    
}
