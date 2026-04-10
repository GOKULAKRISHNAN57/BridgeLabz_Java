package core_programming.strings.Level2;

import java.util.*;

public class string_split_comparison {

    public static String[] splitWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals("")) list.add(word);

        return list.toArray(new String[0]);
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] custom = splitWords(s);
        String[] built = s.split(" ");

        System.out.println(compare(custom, built));
    }
}