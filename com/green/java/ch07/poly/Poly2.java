package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog;
        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + (ani1 instanceof Cat));
        Cat c1 = (Cat)ani1;
    }
}
