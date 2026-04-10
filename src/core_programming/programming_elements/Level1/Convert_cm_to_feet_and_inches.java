package core_programming.programming_elements.Level1;

import java.util.Scanner;

public class Convert_cm_to_feet_and_inches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cm = input.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet + " and inches is " + inches);
    }
}
