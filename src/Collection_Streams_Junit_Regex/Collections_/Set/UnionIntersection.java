package Collection_Streams_Junit_Regex.Collections_.Set;

import java.util.*;

public class UnionIntersection {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(union);
        System.out.println(intersection);
    }
}