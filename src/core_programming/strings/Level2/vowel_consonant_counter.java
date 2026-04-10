package core_programming.strings.Level2;

import java.util.*;

public class vowel_consonant_counter {

    public static int[] countVC(String s) {
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') ch += 32;

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] res = countVC(s);

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}