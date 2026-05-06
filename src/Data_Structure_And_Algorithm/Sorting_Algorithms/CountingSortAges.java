package Data_Structure_And_Algorithm.Sorting_Algorithms;

public class CountingSortAges {

    public static void countingSort(int[] arr) {
        int min = 10, max = 18;

        int[] count = new int[max - min + 1];

        // Step 1: Count frequency
        for (int age : arr) {
            count[age - min]++;
        }

        // Step 2: Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];

        // Step 3: Place elements (stable)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy back
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 10, 18, 14, 12, 16};

        countingSort(ages);

        System.out.println("Sorted Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}