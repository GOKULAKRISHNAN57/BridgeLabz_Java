package core_programming.strings.Level1;

import java.util.*;

public class substring_creation_comparison {

    public static String customSubstring(String s, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = customSubstring(s, start, end);
        String built = s.substring(start, end);

        System.out.println(compare(custom, built));
    }
}
