package core_programming.Extras_Java_String;
public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "The cat sat on the mat";
        String oldWord = "cat";
        String newWord = "dog";
        System.out.println(replaceWord(sentence, oldWord, newWord));
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result += replacement;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
