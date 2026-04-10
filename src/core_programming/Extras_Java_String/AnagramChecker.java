package core_programming.Extras_Java_String;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are Anagrams: " + isAnagram(s1, s2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}