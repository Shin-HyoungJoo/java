package com.green.java.blackjack;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        int gamerscore = rule.getScore(gamer.openCards());
        System.out.println(gamerscore);
        int dealerscore = rule.getScore(dealer.openCards());
        System.out.println(dealerscore);
    }
}
