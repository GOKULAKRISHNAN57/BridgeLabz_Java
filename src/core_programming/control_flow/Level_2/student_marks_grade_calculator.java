package core_programming.control_flow.Level_2;

import java.util.Scanner;

class student_marks_grade_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = total / 3;

        String grade;
        String remark;

        if (percentage >= 90) {
            grade = "A";
            remark = "Excellent";
        } else if (percentage >= 75) {
            grade = "B";
            remark = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remark = "Average";
        } else {
            grade = "F";
            remark = "Fail";
        }

        System.out.println(percentage);
        System.out.println(grade);
        System.out.println(remark);

        input.close();
    }
}
