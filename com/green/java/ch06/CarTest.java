package com.green.java.ch06;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "쉐보레";       //이렇게 안씀 Car.brand로 씀.
        c1.model = "트래버스";
        c1.price = 4500;

        c2.brand = "페라리";
        c2.model = "엔초페라리";
        c2.price = 40_000;

        c1.printInfo();
        c2.printInfo();

        System.out.println(c1.brand);
        System.out.println(c2.brand);
    }
}
