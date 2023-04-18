package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args) {
        String s1 = "Hello";        //대문자 시작 주소값(참조 위치)을 저장함
        String s2 = "World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = s1 + " " + s2 ;         // 왼쪽에서 오른쪽으로 순차적으로 연산한다. 한꺼번에 연산하지 않는다.
        System.out.println(s4);
    }
}
