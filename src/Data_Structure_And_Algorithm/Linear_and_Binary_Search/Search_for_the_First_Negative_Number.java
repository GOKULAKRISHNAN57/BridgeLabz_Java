package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

public class Search_for_the_First_Negative_Number {
    public static void main(String[] args) {
        int[] numbers = {24,56,23,-1,2,39,67};

        boolean check = true;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0){
                check = false;
                System.out.println("this is the first negative number is "+ numbers[i]);
                break;
            }
        }

        if (check){
            System.out.println(-1);
        }
    }
}
