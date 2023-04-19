package com.green.java.ch06;

public class Tv {//Tv = 클래스명 = 타입 = 이름
    String color;
    boolean power;
    int channel;

    void power() {power = !power;} //flag
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}