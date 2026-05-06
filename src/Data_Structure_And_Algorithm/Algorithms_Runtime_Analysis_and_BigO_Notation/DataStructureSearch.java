package Data_Structure_And_Algorithm.Algorithms_Runtime_Analysis_and_BigO_Notation;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 1_000_000;

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            set.add(i);
            tree.add(i);
        }

        int target = n - 1;

        long start = System.nanoTime();
        for (int x : arr) {
            if (x == target) break;
        }
        long end = System.nanoTime();
        System.out.println("Array: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        set.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        tree.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet: " + (end - start) / 1e6 + " ms");
    }
}