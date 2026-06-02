package Collection_Streams_Junit_Regex.Collections_.Map;

import java.util.*;
import java.io.*;

public class WordFrequencyCounter {

    public static void main(String[] args) throws Exception {

        String text = "Hello world hello Java";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.toLowerCase().split(" ");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}