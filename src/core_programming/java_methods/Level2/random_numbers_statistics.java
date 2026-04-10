package core_programming.java_methods.Level2;

import java.util.*;

public class random_numbers_statistics {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int x : arr) {
            sum += x;

            if (x < min) min = x;
            if (x > max) max = x;
        }

        double avg = sum / arr.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        int[] numbers = generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(numbers));

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}