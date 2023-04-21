package com.green.java.ch07;

public class GrandChildTest {
    public static void main(String[] args) {
        //기본 생성자에는 맨 첫줄에 super();가 생략되어 있다.
        // 그래서 자식클래스를 호출해도 부모클래스부터 실행된다, super()는 무조건 첫 줄 고정.
        GrandChild gc = new GrandChild();
    }
}
