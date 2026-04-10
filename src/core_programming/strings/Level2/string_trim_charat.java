package core_programming.strings.Level2;

import java.util.*;

public class string_trim_charat {

    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    public static String substring(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
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

        int[] idx = trimIndexes(s);

        String custom = substring(s, idx[0], idx[1]);
        String built = s.trim();

        System.out.println(compare(custom, built));
    }
}
