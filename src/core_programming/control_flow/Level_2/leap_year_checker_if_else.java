package core_programming.control_flow.Level_2;

import java.util.Scanner;

class leap_year_checker_if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Enter a valid year (>= 1582)");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        input.close();
    }
}