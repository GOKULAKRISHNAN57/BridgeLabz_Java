package core_programming.strings.Level3;

class UniqueCharacters {

    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] findUnique(String s) {
        int len = getLength(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) temp[k++] = ch;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        String s = "programming";
        char[] unique = findUnique(s);

        System.out.println("Unique characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}
