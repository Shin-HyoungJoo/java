package com.green.java.ch07.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);
    }

    static void animalCryingCall(Animal ani) { //메인메소드가 스태틱이라 스태틱 메소드로 만들자.//객체.으로 불러오면 스태틱 꼭 안 붙여도된다.
        ani.crying();
        if (ani instanceof Dog) { //animal이 Dog타입으로 형변환이 가능한가? 객체 dog1이 들어올경우에만 Dog타입으로 형변환가능.
            ((Dog) ani).jump();
        }
    }
}


