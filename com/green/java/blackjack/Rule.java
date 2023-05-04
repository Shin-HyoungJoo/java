package com.green.java.blackjack;

import java.util.List;

public class Rule {


    public static int getScore(List<Card> card) {
        int sum = 0;
        for (Card c : card) {
            sum += getDenomination(c);
        }
        return sum;
    }

    private static int getDenomination(Card c) {
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

    public static void whoIsWIn(Gamer gamer, Dealer dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();
        final int ROLE_POINT = 21;
        if(dPoint > ROLE_POINT && (gPoint > dPoint || gPoint <= ROLE_POINT)) {
            System.out.println("게이머 승");
        } else if ((dPoint <= ROLE_POINT) && (gPoint < dPoint || gPoint > ROLE_POINT)) {
            System.out.println("딜러 승");
        } else {
            System.out.println("무승부");
        }
    }
    
}
