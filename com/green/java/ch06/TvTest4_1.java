package com.green.java.ch06;

public class TvTest4_1 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        Tv tv = new Tv();   //주소값 저장

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = tv;      //tvArr[i]의 주소를 tv로 가는 주소로 변경
            tvArr[i].channel = 10;
        }

        tvArr[0].channel = 1;   //주소를 타고 Tv타입 객체에 1을 저장.
    }
}
