package object_oriented_programming.java_class_and_objects.Level_2;

class ProgramToCheckPalindromeString {

    // Inner class
    static class PalindromeChecker {
        String text;

        //Constructor
        PalindromeChecker(String text) {
            this.text = text;
        }

        boolean isPalindrome() {
            String reversed = new StringBuilder(text).reverse().toString();
            return text.equalsIgnoreCase(reversed);
        }

        void displayResult() {
            if (isPalindrome()) {
                System.out.println(text + " is a palindrome.");
            } else {
                System.out.println(text + " is NOT a palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        PalindromeChecker obj = new PalindromeChecker("madam");
        obj.displayResult();
    }
}
