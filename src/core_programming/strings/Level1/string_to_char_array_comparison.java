package core_programming.strings.Level1;

import java.util.*;

public class string_to_char_array_comparison {

    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] custom = getChars(s);
        char[] built = s.toCharArray();

        System.out.println(compare(custom, built));
    }
}