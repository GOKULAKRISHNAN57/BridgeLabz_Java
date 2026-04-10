package core_programming.strings.Level2;

public class student_vote_checker_array {

    public static int[] generateAges(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 90);
        }
        return arr;
    }

    public static String[][] checkVote(int[] ages) {
        String[][] res = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) res[i][1] = "true";
            else res[i][1] = "false";
        }
        return res;
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);
        String[][] res = checkVote(ages);

        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}