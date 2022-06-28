/*
 * William Alec Akin
 * N300 Programming for Data Analysis
 * Unit 8 Assignment 1 - Java Source Code
 * June 26th, 2022
 * 
 * Description: Using Java, print the malicious traffic as showin in item #1 of the assignment and having a frequency
 * of more than 100. Use the columns of Source, Destination, Protocol, Length, and Info to find the frequency
 * of each result in the dataset. Filter out the good traffic that has protocols starting with alphabetic characters.
 * 
 * 
 * Item #1:
 * 
 * Source             |     Destination     |     Protocol     |     Length     |     Info     |     Frequency     |
 * 00:28:00:01:00:00  | 02:00:00:00:45:00   |  Ox4006          |  44          |  Ethernet II   |    7536           |
 * 
*/

//Import necessary libraries
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Map.Entry;


public class IN300_WilliamAlecAkin_Unit10_Q3_Java {

    public static void main(String[] args) {


        //Borrowed from Unit 6 Assignment
        try (Scanner csvData = new Scanner(
            
                //Read the file in "IN300_Dataset1.csv"
                //Provide abosolute file path to the file to avoid errors
                new File("/Users/alec/Development/PUG-IN300/Unit 9/IN300_Dataset1.csv"))) {
                    List<String> list = new ArrayList<String>();
                    while (csvData.hasNext()) {
                        list.add(csvData.nextLine());
                    }
                    String[] tempArray = list.toArray(new String[1]);
                    String[][] csvArray = new String[tempArray.length][];

                    //Add one dimensionall arrays to a slice
                    String combined_list[] = new String[tempArray.length];

                    String myData = null;



                    //Fille the array for printing to std out later
                    for(int i=0; i < tempArray.length; i++) {
                        if(i == 0) continue;
                        csvArray[i] = tempArray[i].split(",");
                        if(csvArray[i][4].matches("^\"[a-zA-Z].*\"")) {
                            continue;
                        }

                        else {

                            myData = csvArray[i][2] + " " +
                            csvArray[i][3] + " " +
                            csvArray[i][4] + " " +
                            csvArray[i][5] + " " +
                            csvArray[i][6] + " ";

                        combined_list[i] = myData;
                        }

                    }

                    //Get frequency counts
                    getOccurrences("Suspicious Result(s)", combined_list);
                    
                }
                catch(Exception e) {
                    System.out.println("Error: " + e.getMessage());}
                }

                private static void getOccurrences(String message, String[] myArray) {

                    //Add the array to a hashmap for sorting
                    Map<String, Integer> map = new HashMap<>();
                    for (String key : myArray) {
                        if (map.containsKey(key)) {
                            int occurence = map.get(key);
                            occurence++;
                            map.put(key, occurence);
                        } else {
                            map.put(key, 1);
                        }
                    }

                    //Send the array to print to stdout
                    Map<String, Integer> sortedMap =
                    map.entrySet().stream()
                    .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                    (e1, e2) -> e2, LinkedHashMap::new));


                    //Print the results
                    printMap(message, sortedMap);

                }

                private static void printMap(String message, Map<String, Integer> map)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("Printing " + message);
                    System.out.println();

                    //Print the sorted map
                    map.forEach((key, value) -> {
                        if(key != null && value > 100) {
                            System.out.println(key + " appeared " + value + " time(s).");
                        }
                    });
                }

            }




