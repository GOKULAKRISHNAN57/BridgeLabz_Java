package core_programming.Extras_Java_String;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "I love learning Java programming";
        System.out.println(findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
