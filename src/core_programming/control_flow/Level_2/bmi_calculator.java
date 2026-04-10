package core_programming.control_flow.Level_2;

import java.util.Scanner;

class bmi_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println(bmi);
        System.out.println(status);

        input.close();
    }
}