package Collection_Streams_Junit_Regex.Collections_.List;

import java.util.*;

public class FrequencyOfElements {

    public static Map<String, Integer> count(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(count(list));
    }
}