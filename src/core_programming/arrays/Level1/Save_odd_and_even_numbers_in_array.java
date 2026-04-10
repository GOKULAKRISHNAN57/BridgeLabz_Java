package core_programming.arrays.Level1;

import java.util.Scanner;

class Save_odd_and_even_numbers_in_array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odd[i]);
        }

        for (int i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }

        input.close();
    }
}
