package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(5);
        System.out.println("------------------------------");
        gugudan(2, 8);
    }

    public static void gugudan(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }

    public static void gugudan(int num, int num2) {
        for (int i = num; i <= num2; i++) {
            gugudan(i);
            System.out.println("");
        }
    }
}
