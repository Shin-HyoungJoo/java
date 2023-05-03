package com.green.java.blackjack;

import java.util.List;

public class Rule {


    public int getScore(List<Card> card) {
        int sum = 0;
        for (Card c : card) {
            sum += getDenomination(c);
        }
        return sum;
    }

    private int getDenomination(Card c) {
        int number = 0;
        switch (c.getDenomination()) {
            case "A": return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
}
