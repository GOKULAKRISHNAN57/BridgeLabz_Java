package Data_Structure_And_Algorithm.Algorithms_Runtime_Analysis_and_BigO_Notation;

public class FibonacciComparison {

    static int recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    static int iterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {

        int n = 30;

        long start = System.nanoTime();
        recursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        iterative(n);
        end = System.nanoTime();
        System.out.println("Iterative: " + (end - start) / 1e6 + " ms");
    }
}