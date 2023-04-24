package com.green.java.ch06;

public class Tv {//Tv = 클래스명 = 타입 = 이름
    String color;       //
    boolean power;      //인스턴스 멤버필드들
    int channel;        //
    static String brand;    //클래스 멤버필드

    //static -> 멤버필드 사용안할때만 가능.


    void power() {power = !power;} //flag
    void channelUp() {++channel;}
    void channelDown() {--channel;}

    static String getTv() {
        return brand;
    }
}