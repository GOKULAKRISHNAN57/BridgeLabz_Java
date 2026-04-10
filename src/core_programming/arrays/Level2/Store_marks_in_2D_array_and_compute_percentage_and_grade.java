package core_programming.arrays.Level2;

import java.util.Scanner;

class Store_marks_in_2D_array_and_compute_percentage_and_grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[][] marks = new double[number][3];
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

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        for (int i = 0; i < number; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentage[i] + " " + grade[i]);
        }

        input.close();
    }
}