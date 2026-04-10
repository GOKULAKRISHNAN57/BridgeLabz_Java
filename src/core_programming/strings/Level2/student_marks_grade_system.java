package core_programming.strings.Level2;

import java.util.*;

public class student_marks_grade_system {

    public static int[][] generateMarks(int n) {
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = (int)(Math.random() * 100);
            arr[i][1] = (int)(Math.random() * 100);
            arr[i][2] = (int)(Math.random() * 100);
        }
        return arr;
    }

    public static double[][] calculate(int[][] marks) {
        double[][] res = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            res[i][0] = total;
            res[i][1] = Math.round(avg * 100) / 100.0;
            res[i][2] = Math.round(per * 100) / 100.0;
        }
        return res;
    }

    public static String grade(double per) {
        if (per >= 90) return "A";
        else if (per >= 75) return "B";
        else if (per >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {

        int[][] marks = generateMarks(5);
        double[][] res = calculate(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    Arrays.toString(marks[i]) + " | " +
                            res[i][0] + " | " +
                            res[i][1] + " | " +
                            res[i][2] + " | " +
                            grade(res[i][2])
            );
        }
    }
}