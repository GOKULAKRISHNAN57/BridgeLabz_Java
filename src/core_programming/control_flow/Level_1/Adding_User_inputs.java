package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class Adding_User_inputs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0.0;
        System.out.print("Enter a Number : ");
        double userInput = scan.nextDouble();

        while(userInput != 0.0){

            total += userInput;

            System.out.print("Enter a Number : ");
            userInput = scan.nextInt();
        }
    }
}
