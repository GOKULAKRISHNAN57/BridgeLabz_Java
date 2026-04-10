package core_programming.Extras_Logic_Based_Problems;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int num = getInput();
        long result = calculateFactorial(num);
        displayOutput(num, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayOutput(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }
}