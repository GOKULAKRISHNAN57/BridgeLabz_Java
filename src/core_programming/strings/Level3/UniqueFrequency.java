package core_programming.strings.Level3;

class UniqueFrequency {

    static String[][] freq(String s) {
        boolean[] visited = new boolean[256];
        String[][] result = new String[s.length()][2];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!visited[ch]) {
                int count = 0;

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) count++;
                }

                result[k][0] = ch + "";
                result[k][1] = count + "";
                k++;

                visited[ch] = true;
            }
        }

        String[][] finalRes = new String[k][2];
        for (int i = 0; i < k; i++) finalRes[i] = result[i];

        return finalRes;
    }

    public static void main(String[] args) {
        String s = "apple";
        String[][] res = freq(s);

        for (String[] row : res) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}
