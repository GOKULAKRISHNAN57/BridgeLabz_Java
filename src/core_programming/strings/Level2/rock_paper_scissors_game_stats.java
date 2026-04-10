package core_programming.strings.Level2;

import java.util.*;

public class rock_paper_scissors_game_stats {

    public static String computerChoice() {
        String[] arr = {"rock", "paper", "scissors"};
        return arr[(int)(Math.random() * 3)];
    }

    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper"))) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerChoice();

            int res = winner(user, comp);

            if (res == 1) userWins++;
            else if (res == -1) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
    }
}
