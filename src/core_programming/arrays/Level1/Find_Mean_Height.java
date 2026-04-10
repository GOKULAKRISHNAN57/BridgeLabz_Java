package core_programming.arrays.Level1;

import java.util.Scanner;

class Find_Mean_Height {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];

        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println(mean);

        input.close();
    }
}