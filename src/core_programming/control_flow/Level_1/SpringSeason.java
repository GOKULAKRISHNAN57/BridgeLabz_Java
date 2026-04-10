package core_programming.control_flow.Level_1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int month = scanner.nextInt();
        System.out.print("Enter the day : ");
        int day = scanner.nextInt();

        boolean isSpring =
                (month == 3 && day >= 20) ||
                        (month == 4 || month == 5) ||
                        (month == 6 && day <= 20);

        if (isSpring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}