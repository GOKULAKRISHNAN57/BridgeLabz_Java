package core_programming.arrays.Level2;
import java.util.Scanner;

class Find_frequency_of_each_digit {

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

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]);
            }
        }

        input.close();
    }
}
