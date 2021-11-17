package ru.mirea.task14;


import java.util.*;

public class Drunker3 {

    private static final int NUMBER_OF_CARDS = 10;
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Integer> firstPlayerCards = new LinkedList<>();
        Deque<Integer> secondPlayerCards = new LinkedList<>();
        // Duplicate...
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.add(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.add(Integer.parseInt(playerTwoDeck[i]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.remove();
            int secondPlayerCard = secondPlayerCards.remove();
            if (firstPlayerCard < secondPlayerCard || (firstPlayerCard == 9 && secondPlayerCard == 0)) {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            } else {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            }
            ++turnCount;
        }
        if (firstPlayerCards.isEmpty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.isEmpty()) {
            System.out.println("first " + turnCount);
        }
    }
}
