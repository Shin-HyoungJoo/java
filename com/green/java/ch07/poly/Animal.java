package com.green.java.ch07.poly;

public class Animal {
    private String name;



    public void crying() {
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍멍왈왈으르르컹컹");
    }

    public void jump() {
        System.out.println("멍멍이 짬푸!!");
    }
}

class Bulldog extends Dog {public void crying() {
    System.out.println("우루롱!!");
}
}

class Cat extends Animal {
    public void crying() {
        System.out.println("냥냥");
    }

}


class Duck extends Animal {
    public void crying() {
        System.out.println("꽦 꽦");
    }

}
