package com.green.java.ch04;

public class FlowEx13Method {
    public static void main(String[] args) {
        printAllSum(1, 100);
    }

    public static void printAllSum(int n1, int n2) {
        int sum= 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.printf("%d ~ %d sum = %d\n", n1, n2, sum);
    }
}