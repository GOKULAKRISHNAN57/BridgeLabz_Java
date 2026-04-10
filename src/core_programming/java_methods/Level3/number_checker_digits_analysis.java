package core_programming.java_methods.Level3;

import java.util.*;

public class number_checker_digits_analysis {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    public static boolean isDuck(int[] arr) {
        for (int x : arr) {
            if (x == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n, int[] arr) {
        int power = arr.length;
        int sum = 0;

        for (int x : arr) {
            sum += Math.pow(x, power);
        }

        return sum == n;
    }

    public static int[] largestTwo(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return new int[]{max, second};
    }

    public static int[] smallestTwo(int[] arr) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min) {
                second = min;
                min = x;
            } else if (x < second && x != min) {
                second = x;
            }
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        int n = 153;

        int[] digits = getDigits(n);

        System.out.println(Arrays.toString(digits));
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(n, digits));
        System.out.println("Largest: " + Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest: " + Arrays.toString(smallestTwo(digits)));
    }
}
