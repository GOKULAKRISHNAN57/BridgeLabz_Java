package core_programming.programming_elements.Level1;

import java.util.Scanner;

public class Calculate_Maximum_number_of_Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
