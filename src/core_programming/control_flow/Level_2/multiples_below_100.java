package core_programming.control_flow.Level_2;

import java.util.Scanner;

class multiples_below_100 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}