package core_programming.arrays.Level2;

import java.util.Scanner;

class Find_Largest_and_Second_Largest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        for(int digit : digits){
            System.out.print(digit+" ");
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if(largest < digits[i]){
                largest = digits[i];
            }
            else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }

        }


        System.out.println("\n"+largest);
        System.out.println(secondLargest);

        input.close();
    }
}