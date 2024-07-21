package Lecture9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
 
public class Learn {
    // Method to read the columns from the flat file
    public List<String> readFlatFile(String filePath) throws Exception {
        List<String> columns = new ArrayList<>();
        // Use try-with-resources to ensure the BufferedReader is closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine(); // Read the header line
            if (line != null) {
                String[] cols = line.split(","); // Split the header line by commas
                for (String col : cols) {
                    columns.add(col.trim()); // Add each column name to the list
                }
            }
        }
        return columns; // Return the list of column names
    }
 
    public static void main(String[] args) {
        try {
            Learn reader = new Learn();
            // Update the file path to the actual path of your flat file
            List<String> columns = reader.readFlatFile("K:\\SrcFiles\\Abandoned_Calls.csv");
            System.out.println("Columns: " + columns);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}