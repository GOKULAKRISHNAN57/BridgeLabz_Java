package core_programming.arrays.Level1;

import java.util.Scanner;

class Positive_Numbers_Storage_and_Sum_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;

        int index = 0;

        while (true) {

            double number = input.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println(total);

        input.close();
    }
}