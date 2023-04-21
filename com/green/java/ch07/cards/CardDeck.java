package com.green.java.ch07.cards;

import static com.green.java.ch07.cards.Card.NUM_MAX;
import static com.green.java.ch07.cards.Card.KIND;

public class CardDeck {
    Card[] cards;
    
    CardDeck() {
        cards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card("", "");
        }
    }

}
