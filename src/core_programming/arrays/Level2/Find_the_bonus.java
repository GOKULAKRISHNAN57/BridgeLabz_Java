package core_programming.arrays.Level2;

import java.util.Scanner;

class Find_the_bonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {

            double currentSalary = input.nextDouble();
            double serviceYears = input.nextDouble();

            if (currentSalary <= 0 || serviceYears < 0) {
                i--;
                continue;
            }

            salary[i] = currentSalary;
            years[i] = serviceYears;
        }

        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println(totalBonus);
        System.out.println(totalOldSalary);
        System.out.println(totalNewSalary);

        input.close();
    }
}