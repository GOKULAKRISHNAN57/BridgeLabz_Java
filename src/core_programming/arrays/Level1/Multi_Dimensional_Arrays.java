package core_programming.arrays.Level1;
import java.util.Scanner;

class Multi_Dimensional_Arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}