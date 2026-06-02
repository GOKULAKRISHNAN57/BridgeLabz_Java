package Collection_Streams_Junit_Regex.Collections_.Map;

import java.util.*;

public class HighestValueKey {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (var e : map.entrySet()) {

            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }

        System.out.println(maxKey);
    }
}