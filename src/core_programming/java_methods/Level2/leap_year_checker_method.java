package core_programming.java_methods.Level2;

public class leap_year_checker_method {

    public static boolean isLeap(int year) {
        if (year < 1582) return false;

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;

        if (isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
