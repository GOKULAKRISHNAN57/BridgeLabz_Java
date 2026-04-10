package core_programming.Extras_Java_String;

public class SubstringCounter {
    public static void main(String[] args) {
        String text = "javajavapythonjava";
        String target = "java";
        System.out.println(countOccurrences(text, target));
    }

    public static int countOccurrences(String text, String target) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        return count;
    }
}