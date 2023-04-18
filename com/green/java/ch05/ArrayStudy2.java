package com.green.java.ch05;

import java.sql.SQLOutput;

public class ArrayStudy2 {
    public static void main(String[] args) {

        int[] numArr = new int[5];
        for (int i = 0; i < numArr.length; i++) {           //배열(기본) 디폴트 값 = int는 0 boolean은 false
            System.out.println(numArr[i]);                  //대문자 배열(레퍼런스)(String등등) 디폴트 값 = null
        }

        boolean[] boolArr = new boolean[4];
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }
    }
}