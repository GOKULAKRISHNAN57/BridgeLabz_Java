package core_programming.Extras_Logic_Based_Problems;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100!");

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(guess, scanner);

            if (feedback.equals("correct")) {
                System.out.println("I knew it! Easy.");
                guessedCorrectly = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        if (low > high) return low;
        return new Random().nextInt((high - low) + 1) + low;
    }

    public static String getFeedback(int guess, Scanner scanner) {
        System.out.print("Is it " + guess + "? (high/low/correct): ");
        return scanner.next().toLowerCase();
    }
}