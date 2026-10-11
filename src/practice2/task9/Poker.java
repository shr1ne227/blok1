package practice2.task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"♠", "♣", "♥", "♦"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        int cardsPerPlayer = 5;
        int deckSize = suits.length * ranks.length;
        int maxPlayers = deckSize / cardsPerPlayer;

        String[] deck = new String[deckSize];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + suits[i];
                index++;
            }
        }

        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 1 || n > maxPlayers) {
            System.out.print("Введите количество игроков (от 1 до " + maxPlayers + "): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                sc.next();
            }
        }

        index = 0;
        for (int player = 1; player <= n; player++) {
            System.out.println();
            System.out.println("Игрок " + player + ":");
            for (int card = 0; card < cardsPerPlayer; card++) {
                System.out.println(deck[index]);
                index++;
            }
        }
    }
}
