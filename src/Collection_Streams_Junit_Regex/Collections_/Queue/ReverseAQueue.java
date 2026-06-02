package Collection_Streams_Junit_Regex.Collections_.Queue;

import java.util.*;

public class ReverseAQueue {

    public static void reverse(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();
        reverse(queue);
        queue.add(front);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);

        System.out.println(queue);
    }
}