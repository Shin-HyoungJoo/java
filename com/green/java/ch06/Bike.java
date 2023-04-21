package com.green.java.ch06;

public class Bike {
    String brand;
    String model;
    int price;
//기본 생성자 default constructor    //클래스명이랑 똑같아야한다
// 리턴 타입이 없다 = void조차 안넣는다.
//생성자가 하나라도 있으면 jvm이 넣어주지 않는다.
//생성자 오버로딩시에 기본생성자가 있어야 에러가 뜨지 않는다.

    public Bike() {     //기본 생성자

    }

    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(String brand, int price, String model) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(Bike bike) {    //매개 변수가 있는 생성자
        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }

    void drive() {
        System.out.printf("%s브랜드 %s모델이  달린다.", brand, model);
    }
}