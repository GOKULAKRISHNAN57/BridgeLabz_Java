package core_programming.strings.Level3;

class FrequencyNestedLoops {

    static String[][] findFrequency(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        // Step 1: calculate frequency using nested loops
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate
                }
            }

            freq[i] = count;
        }

        // Step 2: count unique characters
        int size = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) size++;
        }

        // Step 3: store result in 2D array
        String[][] result = new String[size][2];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                result[k][0] = arr[i] + "";
                result[k][1] = freq[i] + "";
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "programming";

        String[][] res = findFrequency(s);

        System.out.println("Character Frequency:");
        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
