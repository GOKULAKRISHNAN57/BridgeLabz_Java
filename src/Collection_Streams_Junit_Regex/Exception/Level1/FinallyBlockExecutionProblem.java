package Collection_Streams_Junit_Regex.Exception.Level1;

import java.util.Scanner;

public class FinallyBlockExecutionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // The finally block executes NO MATTER WHAT (whether exception happened or not)
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}