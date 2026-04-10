package core_programming.java_methods.Level2;

import java.util.*;

public class factors_analysis_array {

    public static int[] getFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println(Arrays.toString(factors));
        System.out.println(sum(factors));
        System.out.println(product(factors));
        System.out.println(sumOfSquares(factors));
    }
}