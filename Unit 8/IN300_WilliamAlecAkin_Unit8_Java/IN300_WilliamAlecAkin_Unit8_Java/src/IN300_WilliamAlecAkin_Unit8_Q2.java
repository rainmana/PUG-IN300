/*
William Alec Akin
IN300 Programming for Data Analysis
Unit 8 Assignment 1 - Java Source Code
June 26th, 2022

Description: Write a Java program using JavaFX that reads the dataset "Demographic_Statistics_By_Zip_Code.csv" data
file to create a scatter plot of count_female and count_male only.

 */


//import necessary libraries
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class IN300_WilliamAlecAkin_Unit8_Q2 {

    public static void main(String[] args) throws IOException {

        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries series1 = new XYSeries("Scatter Chart Sample");
        //Read the csv file in
        //NOTE: The file is in the same directory as the .java file, but still may need absolute path?
        try(Scanner dataReader = new Scanner(
            new File("/Users/alec/Development/PUG-IN300/Unit 8/IN300_WilliamAlecAkin_Unit8_Java/IN300_WilliamAlecAkin_Unit8_Java/src/Demographic_Statistics_By_Zip_Code.csv")))

        {
            dataReader.nextLine();
            String line = null;
            String[] row = null;

            //Fill the scanner chart with data from the csv file via a loop
            while(dataReader.hasNext()) {
                line = dataReader.nextLine();
                row = line.split(",");
                int female = Integer.parseInt(row[2]);
                int male = Integer.parseInt(row[4]);
                series1.add(female, male);

                System.out.println("Female Count: " + female + " Male Count: " + male);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }

        dataset.addSeries(series1);

        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
            "Demographic Scatter Plot Graph", //This is the chart title
            "Count_Female", //X-Axis Label
            "Count_Male", //Y-Axis Label
            dataset //Dataset used to construct the chart
            );

            ChartUtils.saveChartAsPNG(new File("IN300_WilliamAlecAkin_Unit8_Q2.png"), scatterPlot, 600, 400);

    }

    
}
