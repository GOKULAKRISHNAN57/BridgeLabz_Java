package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Sum_of_N_natural_numbers_using_for_loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formula = number * (number + 1) / 2;

            System.out.println("Loop Sum = " + sum);
            System.out.println("Formula Sum = " + formula);
        }
    }
}