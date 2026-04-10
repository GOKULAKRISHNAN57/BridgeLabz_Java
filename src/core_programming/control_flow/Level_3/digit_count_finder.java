package core_programming.control_flow.Level_3;

import java.util.Scanner;

class digit_count_finder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        System.out.println(count);

        input.close();
    }
}