package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

public class RethrowingExceptionsProblem {

    // 1. Performs simple division; naturally triggers ArithmeticException if denominator is 0
    public static int performDivision(int numerator, int denominator) {
        return numerator / denominator;
    }

    // 2. Calls performDivision, catches the original exception, and rethrows it with context
    public static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            // Wrapping original exception with extra details and rethrowing it
            throw new ArithmeticException("Calculation failed for numerator " + numerator + ". Reason: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            calculate(10, 0);
        } catch (ArithmeticException e) {
            // 3. Handle the rethrown exception in main
            System.out.println("Error Handled in Main: " + e.getMessage());
        }
    }
}