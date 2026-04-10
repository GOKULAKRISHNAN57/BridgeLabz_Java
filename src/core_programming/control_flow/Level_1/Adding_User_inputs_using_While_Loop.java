package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Adding_User_inputs_using_While_Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double number = scanner.nextDouble();

            if (number <= 0) break;

            total += number;
        }

        System.out.println("Total = " + total);
    }
}
