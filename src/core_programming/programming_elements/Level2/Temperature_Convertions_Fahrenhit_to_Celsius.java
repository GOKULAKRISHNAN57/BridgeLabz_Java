package core_programming.programming_elements.Level2;
import java.util.Scanner;

public class Temperature_Convertions_Fahrenhit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
    }
}