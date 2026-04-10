package core_programming.strings.Level1;

import java.util.*;

public class lowercase_conversion_comparison {

    public static String toLower(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            res += c;
        }
        return res;
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

        String s = sc.nextLine();

        String custom = toLower(s);
        String built = s.toLowerCase();

        System.out.println(compare(custom, built));
    }
}
