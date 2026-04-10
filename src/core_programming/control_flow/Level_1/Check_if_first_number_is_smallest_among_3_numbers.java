package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Check_if_first_number_is_smallest_among_3_numbers {
    public static void main(String[] args) {
        //Write a program to check if the first is the smallest of the 3 numbers.
        //I/P => number1, number2, number3
        //O/P => Is the first number the smallest? ____

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1 :");
        int number1 = scanner.nextInt();

        System.out.print("Enter number1 :");
        int number2 = scanner.nextInt();

        System.out.print("Enter number1 :");
        int number3 = scanner.nextInt();

        if(number1 < number2 && number1 < number3) System.out.println("First Number is smallest");
        else System.out.println("First Number is not the smallest among the three");
    }
}
