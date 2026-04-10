package core_programming.strings.Level2;

import java.util.*;

public class string_length_without_builtin {

    public static int findLength(String s) {
        int count = 0;

        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("Custom: " + findLength(s));
        System.out.println("Built-in: " + s.length());
    }
}
