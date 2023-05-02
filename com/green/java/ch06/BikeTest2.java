package com.green.java.ch06;

public class BikeTest2 {
    public static void main(String[] args) {
        Bike b1 = new Bike("야마하", "H2-1", 10000);
        Bike b2 = b1;
        b2.brand = "혼다";
        System.out.println(b1.brand);
        System.out.println(b2.brand);
        //.을 붙이려면 객체의 주소값을 담고있어야한다,
        // +메소드일경우 리턴타입이여야한다.
    }
}
