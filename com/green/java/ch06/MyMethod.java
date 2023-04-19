package com.green.java.ch06;

public class MyMethod {
    void sum(int n1, int n2) {  // 선언부
        System.out.println(n1 + n2);

    }   //구현부   //return ; 이 생략되어 있다.

    int sum2(int n1, int n2) {
        return n1+ n2;
    }
}
// 선언부 + 구현부 = 정의

/*
    void => return 타입
    (int n1, int n2) = 파라미터, 매개 변수
    sum = 메소드 명
*/