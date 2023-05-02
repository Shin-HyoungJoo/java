package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"♠", "♣", "♥", "◈"};
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;

    public List<Card> getCardList() {
        return cardList;
    }

    public CardDeck() {
        this.cardList = new ArrayList();
        for (String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                this.cardList.add(new Card(pattern, getDenomination(i)));
            }
        }
    }

    public void printCardList() {
        for (Card c : cardList) {
            System.out.println(c.getPattern() + c.getDenomination());
        }
    }

    private String getDenomination(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);

        }
    }
}
