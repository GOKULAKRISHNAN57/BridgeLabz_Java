package core_programming.programming_elements.Level1;

import java.util.Scanner;

public class Find_Distance_in_Yards_and_miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("Area in cm^2 is " + areaCm +
                " and in inches^2 is " + areaInch);
    }
}
