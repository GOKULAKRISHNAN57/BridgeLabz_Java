package core_programming.java_methods.Level1;

import java.util.Scanner;

class smallest_largest_finder {

    public static int[] findSmallestAndLargest(int a, int b, int c) {

        int smallest = a;
        int largest = a;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println(result[0] + " " + result[1]);

        input.close();
    }
}