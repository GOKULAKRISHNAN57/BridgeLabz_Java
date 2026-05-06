package Data_Structure_And_Algorithm.Stack_Queue_HashMap_and_Hashing_Function;

public class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int start = 0, deficit = 0, balance = 0;

        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];

            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        System.out.println(findStart(petrol, distance));
    }
}