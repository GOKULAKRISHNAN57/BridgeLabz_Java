package Collection_Streams_Junit_Regex.Exception.Level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesProblem {
    public static void main(String[] args) {
        // Any resource implementing AutoCloseable can be declared inside try(...)
        // It will automatically be closed regardless of whether an exception occurs or not.
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            // Catching file issues automatically
            System.out.println("Error reading file");
        }
    }
}