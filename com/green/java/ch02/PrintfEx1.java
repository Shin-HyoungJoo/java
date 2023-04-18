package com.green.java.ch02;

public class PrintfEx1 {            //public 붙일 수 있는 클래스는 오직 클래스와 이름이 같은 클래스 뿐이다.
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        int finger = 10;

        System.out.printf("b=%d\n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);
        System.out.printf("finger = [%5d] \n", finger);
        System.out.printf("finger = [%-5d] \n", finger);
        System.out.printf("finger = [%05d] \n", finger);
    }
}
