package core_programming.arrays.Level2;

import java.util.Scanner;

class Store_height_weight_BMI_in_2D_array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            double weightValue = input.nextDouble();
            double heightValue = input.nextDouble();

            if (weightValue <= 0 || heightValue <= 0) {
                i--;
                continue;
            }

            personData[i][0] = weightValue;
            personData[i][1] = heightValue;
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                status[i] = "Normal";
            } else if (personData[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][1] + " " + personData[i][0] + " " + personData[i][2] + " " + status[i]);
        }

        input.close();
    }
}
