package core_programming.Extras_Java_String;

public class StringReverser {
    public static void main(String[] args) {
        String input = "Java Programming";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}