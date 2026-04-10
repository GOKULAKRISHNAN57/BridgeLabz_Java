package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Count_Down_using_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Valid Positive Number : ");
        int count = scanner.nextInt();

        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
    }
}