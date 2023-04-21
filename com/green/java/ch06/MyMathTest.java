package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;

        MyMathInstance c1 = new MyMathInstance();

        int sum = c1.sum(n1, n2);
        System.out.printf("%d + %d = %d\n", n1, n2, sum);

        sum = MyMathStatic.sum(n1, n2);
        System.out.printf("%d + %d = %d\n", n1, n2, sum);
    }
}
