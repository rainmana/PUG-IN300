/*
 * William Alec Akin
 * N300 Programming for Data Analysis
 * Unit 8 Assignment 1 - Java Source Code
 * June 26th, 2022
 * 
 * Description: write a Java program that shows the frequency of columns from the dataset "IN300_Dataset1.csv" below:
 * 1. Source IP and frequency count in descending order
 * 2. Destination IP and frequency count in descending order
 * 3. Protocol and frequency count in descending order
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

public class IN300_WilliamAlecAkin_Unit9_Q2 {

    public static void main(String[] args) {

        //Borrowed this block of code from Assignment 6
        try (Scanner csvData = new Scanner(
            new File("/Users/alec/Development/PUG-IN300/Unit 9/IN300_Dataset1.csv"))) {

            List<String> list = new ArrayList<String>();

            while (csvData.hasNext()) {
                list.add(csvData.nextLine());
            }

            String[] tempArray = list.toArray(new String[1]);
            String[][] csvArray = new String[tempArray.length][];

            //Add one dimensional arrays to slice data
            String source_list[] = new String[tempArray.length];
            String destination_list[] = new String[tempArray.length];
            String protocol_list[] = new String[tempArray.length];

            String sIP = null;
            String dIP = null;
            String protocol = null;

            //Fill the arrays with data for printing
            for(int i=0; i < tempArray.length; i++) {
                if(i == 0) continue;
                csvArray[i] = tempArray[i].split(",");
                sIP = csvArray[i][2];
                dIP = csvArray[i][3];
                protocol = csvArray[i][4];

                source_list[i] = sIP;
                destination_list[i] = dIP;
                protocol_list[i] = protocol;
            }

            //Get the counts described in the comments at top
            getOccurences("Source IP", source_list);
            getOccurences("Destination IP", destination_list);
            getOccurences("Protocol", protocol_list);
    
    }

    //Catch exceptions
    catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    
}

private static void getOccurences(String message, String[] myArray) {
    //Add the array to a hash map for sorting
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

    //Send the array for printing
    Map<String, Integer> sortedMap =
        map.entrySet().stream()
        .sorted(Collections.reverseOrder(Entry.comparingByValue()))
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
            (e1, e2) -> e2, LinkedHashMap::new));

    //Print the array
    printMap(message, sortedMap);
}

private static void printMap(String message, Map<String, Integer> map)
{
    System.out.println();
    System.out.println();
    System.out.println("Printing " + message + " and their occurences:");
    System.out.println();

    //Print the sorted map
    map.forEach((key, value) ->
        System.out.println(key + " appeared " + value + " time(s)."));
}
}
