package core_programming.Extras_Java_String;

public class StringComparator {
    public static void main(String[] args) {
        String first = "apple";
        String second = "banana";
        compareStrings(first, second);
    }

    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        boolean foundDifference = false;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                } else {
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                }
                foundDifference = true;
                break;
            }
        }

        if (!foundDifference) {
            if (s1.length() < s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            } else if (s1.length() > s2.length()) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
            } else {
                System.out.println("Strings are equal");
            }
        }
    }
}