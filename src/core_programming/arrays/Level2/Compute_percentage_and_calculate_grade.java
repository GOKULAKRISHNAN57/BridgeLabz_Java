package core_programming.arrays.Level2;

import java.util.Scanner;

class Compute_percentage_and_calculate_grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {

            double p = input.nextDouble();
            double c = input.nextDouble();
            double m = input.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        for (int i = 0; i < number; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(physics[i] + " " + chemistry[i] + " " + maths[i] + " " + percentage[i] + " " + grade[i]);
        }

        input.close();
    }
}