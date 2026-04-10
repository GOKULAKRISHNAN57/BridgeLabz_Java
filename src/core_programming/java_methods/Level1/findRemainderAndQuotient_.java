package core_programming.java_methods.Level1;
import java.util.Scanner;

class findRemainderAndQuotient_ {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println(result[1] + " " + result[0]);

        input.close();
    }
}
