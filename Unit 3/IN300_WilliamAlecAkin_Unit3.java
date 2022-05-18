/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 3 Assignment - Java Source Code
May 17th, 2022
*/

/* Description: Write a Java program, using ArrayList, and input the above data. Then, loop through the ArrayList and print
them all. Use the following data:

locomotive1 = steam
locomotive2 = diesel
locomotive3 = electric
locomotive4 = coal
locomotive5 = wood
common = combined engines
*/


//Importing the ArrayList class
import java.util.ArrayList;

//Creating the primary class (matches file name)
public class IN300_WilliamAlecAkin_Unit3 {
    
    //Creating the main method
    public static void main(String[] args) {
        
        //Create the array according to the assignment requirements
        ArrayList<String> trains = new ArrayList<String>();
        trains.add("locomotive1");
        trains.add("steam");
        trains.add("locomotive2");
        trains.add("diesel");
        trains.add("locomotive3");
        trains.add("electric");
        trains.add("locomotive4");
        trains.add("coal");
        trains.add("locomotive5");
        trains.add("wood");
        trains.add("common");
        trains.add("combined engines");

        //Loop through the ArrayList and print each element
        for (int i=0; i < trains.size(); i = i + 2) {
            System.out.println(trains.get(i) + "=" + trains.get(i+1));
        }

    }

}