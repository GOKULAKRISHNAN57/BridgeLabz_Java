package Data_Structure_And_Algorithm.Sorting_Algorithms;

public class InsertionSortIDs {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;

            int k = i;

            while (j >= 0 && arr[j] >= arr[k]){

                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
                j--;

            }

        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 109, 3, 112, 2, 103, 57, 104, 109, 112};

        insertionSort(ids);

        System.out.println("Sorted Employee IDs:");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}