package Collection_Streams_Junit_Regex.Collections_.INSURANCE_SYSTEMS;

import java.util.*;

class Policy {
    int policyNo;
    String name;
    String expiryDate;
    String type;
    double premium;

    Policy(int policyNo, String name, String expiryDate, String type, double premium) {
        this.policyNo = policyNo;
        this.name = name;
        this.expiryDate = expiryDate;
        this.type = type;
        this.premium = premium;
    }

    public String toString() {
        return policyNo + " " + name;
    }
}

public class InsuranceSetSystem {

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(p -> p.expiryDate));

        Policy p1 = new Policy(1, "A", "2026-07-01", "Health", 1000);
        Policy p2 = new Policy(2, "B", "2026-06-15", "Auto", 2000);

        hashSet.add(p1);
        hashSet.add(p2);

        linkedSet.add(p1);
        linkedSet.add(p2);

        treeSet.add(p1);
        treeSet.add(p2);

        System.out.println(hashSet);
        System.out.println(linkedSet);
        System.out.println(treeSet);
    }
}