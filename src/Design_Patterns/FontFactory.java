package Design_Patterns;

import java.util.*;

class FontFactory {

    private static Map<String, String> map = new HashMap<>();

    static String getFont(String key) {
        if (!map.containsKey(key)) {
            map.put(key, "Font:" + key);   // create new only once
        }
        return map.get(key);               // reuse existing
    }
}

class FlyweightDemo {
    public static void main(String[] args) {
        String f1 = FontFactory.getFont("Arial");
        String f2 = FontFactory.getFont("Arial");

        System.out.println(f1 == f2); // true → shared object
    }
}