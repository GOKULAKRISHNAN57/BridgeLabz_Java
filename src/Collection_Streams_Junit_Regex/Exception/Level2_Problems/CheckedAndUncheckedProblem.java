package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

import java.io.IOException;

public class CheckedAndUncheckedProblem {

    // Checked exception MUST be declared in signature via 'throws'. 
    // Unchecked (Runtime) exceptions don't require explicit declaration.
    public static void processData(int value) throws IOException {
        if (value < 0) {
            throw new IllegalArgumentException("Unchecked Error: Value cannot be negative.");
        }
        if (value == 0) {
            throw new IOException("Checked Error: Processing capacity cannot be zero.");
        }
        System.out.println("Data processed successfully: " + value);
    }

    public static void main(String[] args) {
        // Handling both types in the caller environment
        try {
            processData(0); // Test checked handling
            // processData(-5); // Test unchecked handling
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }
    }
}