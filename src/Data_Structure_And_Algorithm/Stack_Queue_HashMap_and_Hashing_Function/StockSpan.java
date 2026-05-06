package Data_Structure_And_Algorithm.Stack_Queue_HashMap_and_Hashing_Function;

import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Pop smaller or equal prices
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] result = calculateSpan(price);

        for (int s : result) {
            System.out.print(s + " ");
        }
    }
}