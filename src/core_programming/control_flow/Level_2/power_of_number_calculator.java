package core_programming.control_flow.Level_2;

import java.util.Scanner;

class power_of_number_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(result);

        input.close();
    }
}