package core_programming.java_methods.Level3;

public class student_marks_analysis_system {

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return marks;
    }

    public static double[][] calculate(int[][] marks) {
        double[][] result = new double[marks.length][3]; // total, avg, %

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void display(int[][] marks, double[][] res) {

        System.out.println("P\tC\tM\tTotal\tAvg\t%");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    res[i][0], res[i][1], res[i][2]);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int[][] marks = generateMarks(n);
        double[][] res = calculate(marks);

        display(marks, res);
    }
}