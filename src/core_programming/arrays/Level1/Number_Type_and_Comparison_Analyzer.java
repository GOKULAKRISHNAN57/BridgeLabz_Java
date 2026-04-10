package core_programming.arrays.Level1;

import java.util.Scanner;

class Number_Type_and_Comparison_Analyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First is Greater");
        } else {
            System.out.println("First is Smaller");
        }

        input.close();
    }
}