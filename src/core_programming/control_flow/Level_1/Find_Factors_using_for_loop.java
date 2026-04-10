package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Find_Factors_using_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial = " + factorial);
        }
    }
}