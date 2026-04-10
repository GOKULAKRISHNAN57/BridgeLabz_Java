package core_programming.strings.Level2;

import java.util.*;

public class shortest_longest_word_finder {

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
            } else word += c;
        }
        if (!word.equals("")) list.add(word);

        return list.toArray(new String[0]);
    }

    public static String[] findMinMax(String[] words) {
        String min = words[0];
        String max = words[0];

        for (String w : words) {
            if (w.length() < min.length()) min = w;
            if (w.length() > max.length()) max = w;
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = splitWords(s);
        String[] res = findMinMax(words);

        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
}
