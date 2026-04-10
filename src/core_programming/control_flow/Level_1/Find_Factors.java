package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Find_Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Positive Integer : ");
        int number = scanner.nextInt();

        if (number > 0) {
            int fact = 1;
            int i = 1;

            while (i <= number) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}