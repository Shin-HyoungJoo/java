package com.green.java.ch06;

public class OverloadingTest {
    public static void main(String[] args) {
        sum(1, 2, 3l);
    }

    public static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void sum(int n1, int n2, long n3) {
        System.out.println(n1 + n2 + n3);
    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
