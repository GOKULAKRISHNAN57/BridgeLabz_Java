package core_programming.java_methods.Level2;

import java.util.*;

public class bmi_team_analysis {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);

            data[i][2] = bmi;
        }
    }

    public static String[] getStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        // input
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height (cm)
        }

        calculateBMI(data);
        String[] status = getStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Weight: " + data[i][0] +
                            " Height: " + data[i][1] +
                            " BMI: " + data[i][2] +
                            " Status: " + status[i]
            );
        }
    }
}