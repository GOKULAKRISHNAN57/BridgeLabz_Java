package core_programming.control_flow.Level_2;

import java.util.Scanner;

class factors_of_number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}