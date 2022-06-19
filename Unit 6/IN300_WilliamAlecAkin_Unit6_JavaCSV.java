/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 6 Assignment - Read in CSV file and print specific contentents Java Source Code
June 19th, 2022
*/

/* Description: Write a Java porgram that reads the CSZV file into an ArrayList. Convert the ArrayList to
a string array and print the row number, source IP, and diestination IP on the same line using a loop.
*/

//Import the scanner class
import java.util.*;
import java.io.File;


public class IN300_WilliamAlecAkin_Unit6_JavaCSV {


    public static void main(String[] args) {

        //Read in the csv file - full path may be required per Seminar instructions
        try (Scanner csvData = new Scanner(new File("/Users/alec/Development/PUG-IN300/Unit 6/IN300_Dataset1.csv"))) {
            ArrayList<String> list = new ArrayList<String>();

            //Add the data into an ArrayList
            while (csvData.hasNext()) {
                list.add(csvData.nextLine());
            }

            //Conver the ArrayList to a multidimensional array
            String[] tempArray = list.toArray(new String[1]);
            String[][] csvArray = new String[tempArray.length][];

            //Loop through the requested ouput and pring the data to standard out
            for (int i = 0; i < tempArray.length; i++ ) {
                csvArray[i] = tempArray[i].split(",");
                System.out.println("Row: " + csvArray[i][0] + " " +
                        "Source IP: " + csvArray[i][2] + " " +
                        "Destination IP: " + csvArray[i][3]);
            }

        }
        //Catch any errors and print to sdtout
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
