package core_programming.Extras_Logic_Based_Problems;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(scanner.nextDouble()));
        } else {
            System.out.print("Enter Fahrenheit: ");
            System.out.println("Celsius: " + fahrenheitToCelsius(scanner.nextDouble()));
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
