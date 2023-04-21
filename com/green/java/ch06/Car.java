package com.green.java.ch06;

public class Car {
    static String brand;    //클래스 변수 객체상관X
    String model;           //객체 영향 받음.
    int price;              //객체 영향 받음.

    static void powerOn() {     //static 메소드에서 인스턴스 변수를 쓸 수 없다.
        System.out.printf("%s회사의 차 시동 걸림", brand);
    }
    void printInfo(){
        System.out.printf("brand: %s model : %s, price: %d\n",brand, model, price);
    }
}
