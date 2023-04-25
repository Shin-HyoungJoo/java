package com.green.java.ch07;

public class 랜덤 {
    public static void main(String[] args) {
        String[] 음식 = new String[]{"한식", "양식", "일식", "중식"};

        int random = (int)(Math.random()*4);
        String temp;

        for (int i = 0; i < 음식.length; i++) {
            temp = 음식[i];
            음식[i] = 음식[random];
            음식[random] = temp;
        }
        System.out.printf("오늘 먹을거는 %s",음식);
    }
}
