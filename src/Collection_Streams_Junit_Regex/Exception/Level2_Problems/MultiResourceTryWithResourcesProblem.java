package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultiResourceTryWithResourcesProblem {
    public static void main(String[] args) {
        
        // Separate multiple resources inside the try block with semicolons (;)
        // They will close in the reverse order of their initialization
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader("source1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("source2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("combined.txt"))
        ) {
            String line;
            
            // Read first file and write to combined
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            // Read second file and write to combined
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            System.out.println("Files combined successfully!");

        } catch (IOException e) {
            System.out.println("File compilation error occurred: " + e.getMessage());
        }
    }
}