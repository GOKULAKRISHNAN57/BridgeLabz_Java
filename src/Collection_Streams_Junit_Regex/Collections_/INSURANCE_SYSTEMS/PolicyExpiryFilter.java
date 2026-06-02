package Collection_Streams_Junit_Regex.Collections_.INSURANCE_SYSTEMS;

import java.util.*;

public class PolicyExpiryFilter {

    public static void main(String[] args) {

        Map<String, Integer> policyDays = new HashMap<>();
        policyDays.put("A", 10);
        policyDays.put("B", 40);
        policyDays.put("C", 20);

        for (var e : policyDays.entrySet()) {
            if (e.getValue() <= 30) {
                System.out.println(e.getKey());
            }
        }
    }
}