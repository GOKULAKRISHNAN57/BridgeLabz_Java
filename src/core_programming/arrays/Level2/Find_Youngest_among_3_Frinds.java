package core_programming.arrays.Level2;

import java.util.Scanner;

class Find_Youngest_among_3_Frinds {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int minAgeIndex = 0;
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }

            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println(names[minAgeIndex]);
        System.out.println(names[maxHeightIndex]);

        input.close();
    }
}