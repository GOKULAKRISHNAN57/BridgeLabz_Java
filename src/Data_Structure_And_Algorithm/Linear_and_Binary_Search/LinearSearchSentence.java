package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

public class LinearSearchSentence {

    public static String findSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Data structures are important",
            "I love binary search",
            "Algorithms are fun"
        };

        String word = "binary";

        System.out.println(findSentence(sentences, word));
    }
}