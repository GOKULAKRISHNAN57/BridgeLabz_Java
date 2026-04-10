package core_programming.Extras_Java_String;

public class FrequencyFinder {
    public static void main(String[] args) {
        String input = "success";
        System.out.println("Most Frequent Character: " + findMaxFrequency(input));
    }

    public static char findMaxFrequency(String str) {
        int[] counts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < counts[str.charAt(i)]) {
                max = counts[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}
