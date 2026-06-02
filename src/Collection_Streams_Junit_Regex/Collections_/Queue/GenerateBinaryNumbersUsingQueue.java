package Collection_Streams_Junit_Regex.Collections_.Queue;

import java.util.*;

public class GenerateBinaryNumbersUsingQueue {

    public static List<String> generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {

            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        List<String> binaryNumbers = generateBinary(n);

        System.out.println(binaryNumbers);
    }
}