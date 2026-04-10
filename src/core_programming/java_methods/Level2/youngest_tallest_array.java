package core_programming.java_methods.Level2;

import java.util.*;

public class youngest_tallest_array {

    public static int youngest(int[] ages) {
        int min = ages[0];
        for (int x : ages) {
            if (x < min) min = x;
        }
        return min;
    }

    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int x : heights) {
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + youngest(ages));
        System.out.println("Tallest: " + tallest(heights));
    }
}