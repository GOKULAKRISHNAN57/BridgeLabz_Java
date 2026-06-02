package Collection_Streams_Junit_Regex.Exception.Level1;

public class NestedTryCatchBlockProblem {
    public static void main(String[] args) {
        int[] numbers = {12, 24, 36};
        int index = 2;
        int divisor = 0;

        // Outer try block deals with data access limits
        try {
            int value = numbers[index]; // Could throw ArrayIndexOutOfBoundsException
            
            // Inner try block deals with mathematical processing limits
            try {
                int result = value / divisor; // Could throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}