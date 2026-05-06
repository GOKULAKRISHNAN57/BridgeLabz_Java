package Data_Structure_And_Algorithm.Algorithms_Runtime_Analysis_and_BigO_Notation;

public class StringComparison {

    public static void main(String[] args) {

        int n = 100_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        long end = System.nanoTime();
        System.out.println("String: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) / 1e6 + " ms");
    }
}