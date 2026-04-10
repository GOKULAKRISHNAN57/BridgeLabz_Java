package core_programming.Extras_Logic_Based_Problems;

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        String input = getInput();
        displayResult(input, isPalindrome(input));
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }

    public static void displayResult(String str, boolean result) {
        System.out.println("The string \"" + str + "\" is " + (result ? "" : "not ") + "a palindrome.");
    }
}