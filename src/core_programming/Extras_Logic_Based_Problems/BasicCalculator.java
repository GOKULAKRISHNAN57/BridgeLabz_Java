package core_programming.Extras_Logic_Based_Problems;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + add(num1, num2)); break;
            case '-': System.out.println("Result: " + subtract(num1, num2)); break;
            case '*': System.out.println("Result: " + multiply(num1, num2)); break;
            case '/': System.out.println("Result: " + divide(num1, num2)); break;
            default: System.out.println("Invalid Operation");
        }
    }

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) return 0;
        return a / b;
    }
}