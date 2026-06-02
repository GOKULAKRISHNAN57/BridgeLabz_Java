package Collection_Streams_Junit_Regex.Collections_.List;

import java.util.*;

public class ReverseAList {

    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static <T> List<T> reverseLinkedList(List<T> list) {
        LinkedList<T> result = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(reverseArrayList(list));
        System.out.println(reverseLinkedList(list));
    }
}