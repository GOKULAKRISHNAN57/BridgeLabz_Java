package Collection_Streams_Junit_Regex.Collections_.List;

import java.util.*;

public class NthElementFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        int size = list.size();
        return list.get(size - n);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(findNthFromEnd(list, 2));
    }
}