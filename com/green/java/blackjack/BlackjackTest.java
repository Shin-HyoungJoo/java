package com.green.java.blackjack;

import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if (dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
        }

        gamer.showCards();

        while (true) {
            System.out.println("Card More? (y/n)");
            String answer = scanner.nextLine();
            if ("n".equals(answer.trim().toLowerCase())){
                break;
            }
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }

        Rule.whoIsWIn(gamer, dealer);
        gamer.showCards();
        System.out.println(gamer.getPointSum());
        dealer.showCards();
        System.out.println(dealer.getPointSum());
    }
}
