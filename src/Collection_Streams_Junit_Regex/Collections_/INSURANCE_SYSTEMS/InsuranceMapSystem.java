package Collection_Streams_Junit_Regex.Collections_.INSURANCE_SYSTEMS;

import java.util.*;

public class InsuranceMapSystem {

    public static void main(String[] args) {

        Map<Integer, String> policies = new HashMap<>();
        policies.put(1, "Health");
        policies.put(2, "Auto");
        policies.put(3, "Home");

        System.out.println(policies.get(2));
    }
}