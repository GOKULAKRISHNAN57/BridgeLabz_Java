package core_programming.java_methods.Level3;

import java.util.*;

public class number_checker_advanced_factors {

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[index++] = i;
        }
        return arr;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    public static double cubeProduct(int[] arr) {
        double p = 1;
        for (int x : arr) p *= Math.pow(x, 3);
        return p;
    }

    public static int properSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return properSum(n) == n;
    }

    public static boolean isAbundant(int n) {
        return properSum(n) > n;
    }

    public static boolean isDeficient(int n) {
        return properSum(n) < n;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 28;

        int[] factors = getFactors(n);

        System.out.println(Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Cube Product: " + cubeProduct(factors));

        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
