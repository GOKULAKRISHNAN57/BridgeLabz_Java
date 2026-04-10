package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Check_diisible_by_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number to check if it is divisible by 5 : ");
        int number = scan.nextInt();

        if(number % 5 == 0) System.out.println("It is divisible.");
        else System.out.println("Its not divisible.");
    }
}
