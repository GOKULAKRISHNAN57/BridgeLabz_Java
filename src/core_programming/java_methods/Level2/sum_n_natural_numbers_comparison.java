package core_programming.java_methods.Level2;

public class sum_n_natural_numbers_comparison {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;

        if (n <= 0) {
            System.out.println("Not Natural");
            return;
        }

        System.out.println(recursiveSum(n));
        System.out.println(formulaSum(n));
    }
}