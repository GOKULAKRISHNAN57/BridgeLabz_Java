package core_programming.programming_elements.Level2;

import java.util.Scanner;

public class Temperature_Conversions_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
    }
}