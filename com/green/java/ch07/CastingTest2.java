package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
//        fc = (FireCar) car;   //자식변수는 부모객체를 담은 변수를 대입불가.
    }
}
