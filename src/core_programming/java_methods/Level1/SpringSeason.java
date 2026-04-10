package core_programming.java_methods.Level1;
import java.util.Scanner;

class SpringSeason {

    public static boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        input.close();
    }
}