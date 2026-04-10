package core_programming.strings.Level2;

import java.util.*;

public class words_with_lengths_2d_array {

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count++); }
        } catch (Exception e) {}
        return count;
    }

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

    public static String[][] wordWithLength(String[] words) {
        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] result = wordWithLength(splitWords(s));

        for (String[] row : result) {
            System.out.println(row[0] + " -> " + Integer.parseInt(row[1]));
        }
    }
}
