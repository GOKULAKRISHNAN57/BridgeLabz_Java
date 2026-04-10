package core_programming.java_methods.Level1;

import java.util.Scanner;

class Check_Wheather_Number_is_Positive_zero_Or_Negative {

    public static int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(checkNumber(n));

        input.close();
    }
}