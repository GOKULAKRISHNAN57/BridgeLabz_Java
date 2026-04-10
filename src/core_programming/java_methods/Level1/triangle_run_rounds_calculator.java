package core_programming.java_methods.Level1;

import java.util.Scanner;

class triangle_run_rounds_calculator {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println(calculateRounds(a, b, c));

        input.close();
    }
}