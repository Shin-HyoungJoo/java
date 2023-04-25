package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = (Car)fc;
//        car.water();
        car = new Car();
        if(car instanceof FireCar) {    //자식 참조변수는 부모 객체를 담을수 없다.
            fc2 = (FireCar) car;
            fc2.water();
        } else {
            System.out.println("안돼!!");
        }
    }
}

class Car {
    void drive() {
        System.out.println("drive, Brrrrr~");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}