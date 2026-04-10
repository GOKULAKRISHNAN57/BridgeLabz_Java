package core_programming.Extras_Logic_Based_Problems;
import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        int[] inputs = takeInput();
        int max = findMax(inputs[0], inputs[1], inputs[2]);
        System.out.println("Maximum value: " + max);
    }

    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}