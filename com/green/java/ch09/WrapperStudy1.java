package com.green.java.ch09;

public class WrapperStudy1 {
    public static void main(String[] args) {
        //primitive type
        //정수형 byte, short, int, long
        //실수형 float, double
        //문자형 char
        //불린형 boolean

        Integer i1 = 10;
        int i2 = 10;

        String s1 = Integer.toString(i2);
        String s2 = i1.toString(i2);

        System.out.println(i1 == i2);
        System.out.println(s1 + "   " + s2);

        Byte b1 = 10;
        Short sh1 = 10;
        Long l1 = 10l;
        long l2 = 10;

        Float f1 = 10.1f;
        Double d1 = 10d;

        Character c1 = 'c';

        Boolean bo1 = true;

    }
}
