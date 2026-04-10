package core_programming.Extras_Java_String;

public class DuplicateRemover {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            if (!result.contains(currentChar)) {
                result += currentChar;
            }
        }
        return result;
    }
}