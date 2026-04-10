package core_programming.Extras_Java_String;

public class CharacterRemover {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        System.out.println("Modified String: " + removeChar(input, toRemove));
    }

    public static String removeChar(String str, char target) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}