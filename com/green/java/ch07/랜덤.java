package com.green.java.ch07;

public class 랜덤 {
    public static void main(String[] args) {
        String[] 음식 = new String[]{"패스트", "양식", "일식", "한식"};

        int random = (int) (Math.random() * 4);
        System.out.printf("오늘 먹을거는 %s\n", 음식[random]);
    }
}
