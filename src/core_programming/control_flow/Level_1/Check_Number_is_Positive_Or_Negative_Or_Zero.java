package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Check_Number_is_Positive_Or_Negative_Or_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0)
            System.out.println("positive");
        else if (num < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
