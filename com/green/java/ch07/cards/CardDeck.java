package com.green.java.ch07.cards;

import static com.green.java.ch07.cards.Card.NUM_MAX;
import static com.green.java.ch07.cards.Card.KIND;

public class CardDeck {
    Card[] cards;
    int idx;

    CardDeck() {
        cards = new Card[52];
        String b;
        for (int i = 0; i < cards.length; i++) {
            String a = Card.KIND[i / Card.NUM_MAX];
            switch (i % Card.NUM_MAX + 1) {
                case 1:
                    b = "A";
                    break;
                case 11:
                    b = "J";
                    break;
                case 12:
                    b = "Q";
                    break;
                case 13:
                    b = "K";
                    break;

                default:
                    b = String.valueOf((i % Card.NUM_MAX) + 1);
            }
            cards[i] = new Card(a, b);
        }
//        for (Card c : cards) {
//            System.out.println(c.kind + " " + c.num);
//        }
    }

    void openCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    void shuffle() {
        Card temp;
        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * cards.length);
            if (i == random) {
                continue;
            }
            temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
        System.out.println("===========================");
    }

    Card pick() {
        if (idx == cards.length) {
            return null;
        }
        Card temp = cards[idx];
        cards[idx] = null;
        idx++;
        return temp;
    }
}
