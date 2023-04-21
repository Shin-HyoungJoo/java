package com.green.java.ch07;

public class Child extends Parent {
    int age;
    public Child(){
        System.out.println("");
    }

    public Child(int age){
        super();
        super.age = age;
        System.out.println("----- Child 기본 생성자 -----");
    }

    public int getSuperAge() {
        return super.age;
    }

    public int getThisAge() {
        return this.age;
    }

    void play() {
        System.out.printf("%d 살인 아이가 논다.\n", age);
    }
}
