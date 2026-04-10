package core_programming.java_methods.Level1;

import java.util.Scanner;

class Sum_of_N_Natural_Numbers {

    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(sumN(n));

        input.close();
    }
}