package com.green.java.ch06;

public class BikeTest {
    public static void main(String[] args) {
        Bike n1 = new Bike();       //Bike() -> 생성자 호출 -> 자동 생성 -> 컴파일러가 자동으로 넣어줌
        Bike n2 = new Bike("야마하",123,"가나다");
        System.out.println(n1.brand);   //대문자 시작.asd일 경우 asd는 클래스메소드이다.(static이다)
        System.out.println(n2.brand);
    }
}
