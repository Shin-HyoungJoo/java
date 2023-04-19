package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();   //Tv클래스의 객체의 주소값만 받을 수 있는 레퍼런스
        System.out.printf("power : %b\n", tv.power);
        System.out.printf("channel : %d\n", tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n", tv.power);
        tv.power();
        System.out.printf("power : %b\n", tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);
    }
}
