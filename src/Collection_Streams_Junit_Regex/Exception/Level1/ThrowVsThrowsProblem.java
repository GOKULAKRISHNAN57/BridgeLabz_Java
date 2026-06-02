package Collection_Streams_Junit_Regex.Exception.Level1;

public class ThrowVsThrowsProblem {

    // 'throws' in the signature warns the caller that this method might throw an unhandled exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // 'throw' is used to explicitly instantiate and trigger the exception right here
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            // Trying an invalid input to verify enforcement
            double interest = calculateInterest(-5000, 4.5, 3);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            // Catching the propagated exception thrown from calculateInterest method
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}