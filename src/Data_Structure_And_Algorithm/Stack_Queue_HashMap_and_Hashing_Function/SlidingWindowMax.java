package Data_Structure_And_Algorithm.Stack_Queue_HashMap_and_Hashing_Function;

import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove out of window
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            // Print max
            if (i >= k - 1) {
                System.out.print(nums[dq.peek()] + " ");
            }
        }
    }
}