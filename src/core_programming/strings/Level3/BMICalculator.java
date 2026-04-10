package core_programming.strings.Level3;

import java.util.*;

class BMICalculator {

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;

            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]); // height
            result[i][1] = String.valueOf(weight);     // weight
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight and height(cm) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }
}