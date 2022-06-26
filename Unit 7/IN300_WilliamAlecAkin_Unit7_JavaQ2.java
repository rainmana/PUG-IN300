/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 7 Assignment - Java Source Code (Mean, median, mode, standard deviation)

Description:
Write a Java program that reads the text file. Using meaningful print statements, output the mean, median, mode,
and standard deviation.

File name: IN300_Dataset2.txt
*/

//Import necessary libraries
import java.util.*;
import java.io.File;


public class IN300_WilliamAlecAkin_Unit7_JavaQ2 {

    public static void main(String[] args) {

        try {
            //Read the IN300_Dataset2.txt file into an array
            //Specify the full file path if there are issues with loading it
            Scanner scanner = new Scanner(new File("/Users/alec/Development/PUG-IN300/Unit 7/IN300_Dataset2.txt"));
            int [] result = new int [250000];
            int i = 0;
            while(scanner.hasNextInt()){
                result[i++] = scanner.nextInt();
            }

            //Calculate the mean and print it to standard out
            OptionalDouble mean = Arrays.stream(result).average();

            if(mean.isPresent()) {
                System.out.println("The mean (average) is : " + mean.getAsDouble());
            }
            else {
                System.out.println("There are no values to average. Please try again.");
            }

            //Calculate the median and print it to standard out
            if(result.length%2 == 0) { //This is for an even number of elements
                double mid1 = result[(result.length/2)-1];
                double mid2 = result[result.length/2];
                double median = (mid1 + mid2)/2;
                System.out.println("The median is : " + median);}

            else{
                double median = result[(result.length/2)+1];
                System.out.println("The median is : " + median);
            }

            //Calculate the mode and print it to standard out
            int modeCount = 0;
            double mode = 0;
            int tempCnt = 0;

            for (double intValue : result) {
                tempCnt = 0;
                for (double value : result) {
                    if (intValue == value) {
                        tempCnt++;
                    }
                }
                if (tempCnt > modeCount) {
                    modeCount = tempCnt;
                    mode = intValue;
                    }
                }

                //Wait for the result to process
                System.out.println("Mode " + mode + " appears " + modeCount + " times.");


                //Calculate the standard deviation and print it to standard out
                int sdSum = 0;
                for (double dValue : result) {
                    sdSum += Math.pow((dValue - mean.getAsDouble()), 2);
                }
                
                System.out.println("The standard deviation is : " + Math.sqrt( sdSum / ( result.length ) ));

                scanner.close();
            }
            catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            }
        
    }

    
