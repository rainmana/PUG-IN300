import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtils;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IN300_Unit8_A1 extends JFrame {

    public IN300_Unit8_A1() {

        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        pack();
        setTitle("Bar chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            ChartUtils.saveChartAsPNG(new File("U8_A1.png"), chart, 1000, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private CategoryDataset createDataset() {

        String[][] dataArray = getMyData();
        
        var dataset = new DefaultCategoryDataset();
        dataset.setValue(Integer.parseInt(dataArray[1][4]), "count1", dataArray[1][2]);
        dataset.setValue(Integer.parseInt(dataArray[2][4]), "count2",dataArray[1][2] );
        dataset.setValue(Integer.parseInt(dataArray[8][4]), "count1", dataArray[8][2]);
        dataset.setValue(Integer.parseInt(dataArray[9][4]), "count2",dataArray[8][2]);
        dataset.setValue(Integer.parseInt(dataArray[40][4]), "count1", dataArray[40][2]);
        dataset.setValue(Integer.parseInt(dataArray[41][4]), "count2",dataArray[40][2] );

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
    		
    		//Read the data.
    		//NOTE: May have to change the path
    		Scanner csvData = new Scanner(new File("/home/codio/workspace/IN300/src/Average_Daily_Traffic_Counts.csv"));
   
    		//Fill the array list with the data
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
			System.out.println(ex);
		}
    	
    	//Return the array with data
    	return csvArray;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {           
            var ex = new IN300_Unit8_A1();
            ex.setVisible(true); 
        });

    }
}




