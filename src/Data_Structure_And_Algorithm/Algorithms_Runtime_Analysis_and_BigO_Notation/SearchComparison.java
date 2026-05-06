package Data_Structure_And_Algorithm.Algorithms_Runtime_Analysis_and_BigO_Notation;

import java.util.*;

public class SearchComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 1_000_000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = i;

        int target = n - 1;

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear: " + (end - start) / 1e6 + " ms");

        Arrays.sort(arr);

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary: " + (end - start) / 1e6 + " ms");
    }
}