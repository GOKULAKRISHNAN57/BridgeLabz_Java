package core_programming.arrays.Level2;

import java.util.Scanner;

class Reverse_a_number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int tempNumber = number;
        int count = 0;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        int[] digits = new int[count];

        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        input.close();
    }
}