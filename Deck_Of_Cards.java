package com.bridgelabz;

import java.util.LinkedList;
import java.util.Random;

public class Deck_Of_Cards {
	static LinkedList person1 = new LinkedList();
    static LinkedList person2 = new LinkedList();
    static LinkedList person3 = new LinkedList();
    static LinkedList person4 = new LinkedList();
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] deck = new String[suits.length][ranks.length];

    /*
     * deckOfCard is used to initialize the deck with cards
     */
    public void deckOfCard() {
        for (int row = 0; row < suits.length; row++) {
            for (int column = 0; column < ranks.length; column++) {
                deck[row][column] = ranks[column] + "-" + suits[row] + " ";
            }
        }
    }

    public void shuffleCard() {
        Random random = new Random();
        for (int row = 0; row < suits.length; row++) {
            for (int column = 0; column < ranks.length; column++) {
                int r = (random.nextInt(suits.length));
                int k = (random.nextInt(ranks.length));
                String temp = deck[r][k];
                deck[r][k] = deck[row][column];
                deck[row][column] = temp;
            }
        }
    }

    public void display() {
        for (int row = 0; row < suits.length; row++) {
            System.out.print(" person" + row + " ");
            for (int column = 0; column < ranks.length; column++) {
                System.out.print(deck[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deck_Of_Cards obj = new Deck_Of_Cards();
        obj.deckOfCard();
        obj.shuffleCard();
        obj.display();

    }
}
