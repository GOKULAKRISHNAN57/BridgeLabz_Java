package Collection_Streams_Junit_Regex.Exception.Level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // May throw ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handles cases where the user inputs text instead of integers
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}