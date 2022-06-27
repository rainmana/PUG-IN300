/*
William Alec Akin
IN300 Programming for Data Analysis
Unit 8 Assignment 1 - Java Source Code
June 26th, 2022

Description: Write a Java program using JavaFX that reads the dataset "Average_Daily_Traffic_Counts.csv" file plot a bar chart.

 */

//Import necessary libraries
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;


public class IN300_WilliamAlecAkin_Unit8_Q1 extends JFrame {


    public IN300_WilliamAlecAkin_Unit8_Q1() {

        initUI();
    }
    
    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        pack();
        setTitle("Bar Chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            ChartUtils.saveChartAsPNG(new File("IN300_Unit8_Q1.png"), chart, 1000, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private CategoryDataset createDataset() {

        String[][] dataArray = getMyData();

        var dataset = new DefaultCategoryDataset();
        dataset.setValue(Integer.parseInt(dataArray[1][4]), "count1", dataArray[1][2]);
        dataset.setValue(Integer.parseInt(dataArray[2][4]), "count2", dataArray[1][2]);
        dataset.setValue(Integer.parseInt(dataArray[8][4]), "count1", dataArray[8][2]);
        dataset.setValue(Integer.parseInt(dataArray[9][4]), "count2", dataArray[8][2]);
        dataset.setValue(Integer.parseInt(dataArray[40][4]), "count1", dataArray[40][2]);
        dataset.setValue(Integer.parseInt(dataArray[41][4]), "count2", dataArray[40][2]);

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart for Traffic Counts",
                "Street",
                "Count",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;

    }

    public String[][] getMyData() {
        
        String[][] csvArray = null;

        try {

            //Read in the csv file "Average_Daily_Traffic_Counts.csv"
            //May need to provide absolute path to the file
            Scanner csvData = new Scanner(new File("/Users/alec/Development/PUG-IN300/Unit 8/IN300_WilliamAlecAkin_Unit8_Java/IN300_WilliamAlecAkin_Unit8_Java/src/Average_Daily_Traffic_Counts.csv"));

            //File the array list with the data from the csv
            ArrayList<String> list = new ArrayList<String>();
            while (csvData.hasNext()) {
                list.add(csvData.nextLine());
            }
            String[] tempArray = list.toArray(new String[1]);
            csvArray = new String[tempArray.length][];

            for(int i=0; i < tempArray.length; i++) {
                csvArray[i] = tempArray[i].split(",");
            }

            csvData.close();
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        //Return the array with newly added data
        return csvArray;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new IN300_WilliamAlecAkin_Unit8_Q1();
            ex.setVisible(true);
        });
        }
    }
