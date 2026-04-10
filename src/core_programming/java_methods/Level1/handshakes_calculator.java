package core_programming.java_methods.Level1;

import java.util.Scanner;

class handshakes_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int result = (n * (n - 1)) / 2;

        System.out.println(result);

        input.close();
    }
}