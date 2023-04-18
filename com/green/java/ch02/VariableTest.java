package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args) {
        String r1 = "안녕" + 1 + 1;   //형변환 진행 안녕 + 1이 스트링으로 변환된다.
        System.out.println(r1);

        String r2 = "안녕" + (1 + 1); //소괄호 사칙연산 후 스트링으로 합쳐진다.
        System.out.println(r2);

        String r3 = 1 + 1 + "안녕";   //왼쪽부터 연산해서 1+1=2 만들고 둘이 합쳐 2안녕
        System.out.println(r3);
    }
}