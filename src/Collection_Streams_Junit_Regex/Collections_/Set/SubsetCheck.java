package Collection_Streams_Junit_Regex.Collections_.Set;

import java.util.*;

public class SubsetCheck {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(b.containsAll(a));
    }
}