package core_programming.programming_elements.Level2;
import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}