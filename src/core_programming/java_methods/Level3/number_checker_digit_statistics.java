package core_programming.java_methods.Level3;

public class number_checker_digit_statistics {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static double sumSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] arr) {
        return n % sum(arr) == 0;
    }

    public static int[][] frequency(int[] arr) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int x : arr) {
            freq[x][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int n = 21;
        int[] digits = getDigits(n);

        System.out.println("Sum: " + sum(digits));
        System.out.println("Squares Sum: " + sumSquares(digits));
        System.out.println("Harshad: " + isHarshad(n, digits));

        int[][] freq = frequency(digits);
        for (int[] row : freq) {
            if (row[1] > 0)
                System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
