package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

import java.util.regex.Pattern;

public class Binary_Search {

    public static void main(String[] args) {
        int[] nums = {1,12,34,48,52,68};

        int target = 68;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target) {
                System.out.println("Found");
                break;
            }

            else if(nums[mid] > target){
                end = mid;
                end--;
            }
            else {
                start = mid;
                start++;
            }
        }
    }
}
