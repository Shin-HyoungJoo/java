package com.green.java.ch07.cards;

public class Card {
    static final String[] KIND = {"CLOVER", "HEART", "DIAMOND", "SPADE"}; //무늬들
    static final int NUM_MAX = 13;  //무늬별 카드 수

    String kind; //무늬
    String num; //번호
//A~K
    public Card (String kind,String num) {
        this.kind = kind;
        this.num = num;
    }
}
