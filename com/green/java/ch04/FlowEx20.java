package com.green.java.ch04;

public class FlowEx20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("[%d, %d] ",i,j);
            }
            System.out.println();
        }

    }
}