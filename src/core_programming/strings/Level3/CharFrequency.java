package core_programming.strings.Level3;

class CharFrequency {

    static String[][] frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[k][0] = (char) i + "";
                result[k][1] = freq[i] + "";
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "banana";
        String[][] res = frequency(s);

        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}