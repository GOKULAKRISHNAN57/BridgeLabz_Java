package core_programming.control_flow.Level_3;

import java.util.Scanner;

class harshad_number_checker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int tempNumber = number;
        int sum = 0;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber = tempNumber / 10;
        }

        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }

        input.close();
    }
}