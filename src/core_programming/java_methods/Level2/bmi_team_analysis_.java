package core_programming.java_methods.Level2;

import java.util.*;

public class bmi_team_analysis_ {

    public static double[] findRoots(double a, double b, double c) {

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        else {
            return new double[0]; // no real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.println(Arrays.toString(roots));
        }
    }
}
