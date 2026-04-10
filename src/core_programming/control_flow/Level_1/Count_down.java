package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Count_down {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Positive Number : ");
        int count = scanner.nextInt();

        while (count >= 1) {
            System.out.println(count);
            count--;
        }
    }
}