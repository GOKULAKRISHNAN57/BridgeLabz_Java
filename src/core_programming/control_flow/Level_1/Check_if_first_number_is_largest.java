package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Check_if_first_number_is_largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1 :");
        int number1 = scanner.nextInt();

        System.out.print("Enter number1 :");
        int number2 = scanner.nextInt();

        System.out.print("Enter number1 :");
        int number3 = scanner.nextInt();

        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));
    }
}
