package Data_Structure_And_Algorithm.Sorting_Algorithms;

public class QuickSortPrices {

    public static int quickSortSeperationMethod(int[] prices, int start, int end){

        int pivot = prices[end];
        int pivotIndex = end;

        while (start <= end){

            if(prices[start] > pivot && prices[end] < pivot){

                int temp = prices[start];
                prices[start] = prices[end];
                prices[end] = temp;

            }
            if (prices[start] <= pivot) {
                start++;
            }

            if(prices[end] >= pivot){
                end--;
            }
        }

        prices[pivotIndex] = prices[start];
        prices[start] = pivot;

        return start;
    }

    public static void quickSort(int[] prices, int start, int end){

        if(start < end){
            int middle = quickSortSeperationMethod(prices, start, end);
            quickSort(prices, start, middle-1);
            quickSort(prices, middle+1, end);
        }

    }

    public static void main(String[] args) {
        int[] prices = {10,15,1,2,57,9,16,7,11,3,5,1};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}