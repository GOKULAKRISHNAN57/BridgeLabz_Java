package Collection_Streams_Junit_Regex.Collections_.Set;

import java.util.*;

public class SymmetricDifference {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);

        Set<Integer> temp = new HashSet<>(a);
        temp.retainAll(b);

        result.removeAll(temp);

        System.out.println(result);
    }
}