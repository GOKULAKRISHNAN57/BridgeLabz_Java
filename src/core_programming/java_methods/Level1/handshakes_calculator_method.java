package core_programming.java_methods.Level1;

import java.util.Scanner;

class handshakes_calculator_method {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(calculateHandshakes(n));

        input.close();
    }
}