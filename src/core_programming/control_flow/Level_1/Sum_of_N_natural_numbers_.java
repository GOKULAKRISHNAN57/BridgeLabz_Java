package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Sum_of_N_natural_numbers_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int sumLoop = 0;
            int i = 1;

            while (i <= number) {
                sumLoop += i;
                i++;
            }

            int sumFormula = number * (number + 1) / 2;

            System.out.println("Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}