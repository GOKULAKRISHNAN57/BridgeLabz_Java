package core_programming.arrays.Level2;

import java.util.Scanner;

class BMI_Calculations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightMeter * heightMeter);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }

        input.close();
    }
}