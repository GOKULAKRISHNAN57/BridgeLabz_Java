package core_programming.strings.Level3;

import java.util.*;

class DeckOfCards {

    static String[] createDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[52];
        int k = 0;

        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }
        return deck;
    }

    static void shuffle(String[] deck) {
        Random r = new Random();

        for (int i = 0; i < deck.length; i++) {
            int j = i + r.nextInt(deck.length - i);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    static String[][] distribute(String[] deck, int players, int cardsEach) {
        String[][] res = new String[players][cardsEach];
        int k = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                res[i][j] = deck[k++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        shuffle(deck);

        String[][] players = distribute(deck, 4, 5);

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
