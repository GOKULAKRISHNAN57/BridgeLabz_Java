package core_programming.java_methods.Level3;

import java.util.*;

public class football_team_height_analysis {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }

        System.out.println(Arrays.toString(heights));
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}
