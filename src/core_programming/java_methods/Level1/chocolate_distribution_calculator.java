package core_programming.java_methods.Level1;

import java.util.Scanner;

class chocolate_distribution_calculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println(result[0] + " " + result[1]);

        input.close();
    }
}