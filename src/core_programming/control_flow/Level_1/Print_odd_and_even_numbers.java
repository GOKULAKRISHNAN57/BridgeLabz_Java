package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Print_odd_and_even_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }
}