package core_programming.Extras_Java_String;

public class PalindromeChecker {
    public static void main(String[] args) {
        String text = "madam";
        boolean isPalindrome = checkPalindrome(text);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
