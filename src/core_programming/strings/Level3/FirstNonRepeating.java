package core_programming.strings.Level3;

class FirstNonRepeating {

    static char find(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }

        return '-';
    }

    public static void main(String[] args) {
        String s = "swiss";
        System.out.println("First Non-Repeating: " + find(s));
    }
}
