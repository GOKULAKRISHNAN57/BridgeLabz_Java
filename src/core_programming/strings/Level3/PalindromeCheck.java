package core_programming.strings.Level3;

class PalindromeCheck {

    static boolean method1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    static boolean method2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return method2(s, i + 1, j - 1);
    }

    static boolean method3(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";

        System.out.println(method1(s));
        System.out.println(method2(s, 0, s.length() - 1));
        System.out.println(method3(s));
    }
}
