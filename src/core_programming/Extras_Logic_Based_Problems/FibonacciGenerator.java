package core_programming.Extras_Logic_Based_Problems;
import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        generateAndPrintFibonacci(terms);
    }

    public static void generateAndPrintFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}