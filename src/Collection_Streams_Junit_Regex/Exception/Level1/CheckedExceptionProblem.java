package Collection_Streams_Junit_Regex.Exception.Level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionProblem {
    public static void main(String[] args) {
        // BufferedReader and FileReader can throw IOException (a checked exception)
        // This requires mandatory handling using try-catch or throws declaration
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Catching the checked IOException if data.txt does not exist or cannot be read
            System.out.println("File not found");
        } finally {
            // Closing the resource manually to prevent memory leaks
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader.");
            }
        }
    }
}