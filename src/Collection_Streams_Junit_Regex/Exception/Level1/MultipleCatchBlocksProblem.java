package Collection_Streams_Junit_Regex.Exception.Level1;

public class MultipleCatchBlocksProblem {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        // Test case 1: Normal execution
        processArray(numbers, 1); 
        
        // Test case 2: Triggers ArrayIndexOutOfBoundsException
        processArray(numbers, 5); 
        
        // Test case 3: Triggers NullPointerException
        processArray(null, 0); 
    }

    public static void processArray(int[] arr, int index) {
        try {
            // This line can throw NullPointerException if arr is null, 
            // or ArrayIndexOutOfBoundsException if index is out of bounds.
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (NullPointerException e) {
            // Specific catch for null references
            System.out.println("Array is not initialized!");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Specific catch for invalid indices
            System.out.println("Invalid index!");
        } catch (Exception e) {
            // General catch-all block (Must always be placed last)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}