package Collection_Streams_Junit_Regex.Exception.Level1;

import java.util.Scanner;

// Step 1: Define the custom checked exception by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionProblem {
    // Step 2: Declare that this method can throw our custom exception using 'throws'
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Explicitly throw the custom exception using 'throw'
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Catching and handling our custom exception
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}