package core_programming.strings.Level2;

import java.util.*;

public class character_type_identifier {

    public static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not Letter";
    }

    public static String[][] analyze(String s) {
        String[][] res = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = check(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] res = analyze(s);

        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
