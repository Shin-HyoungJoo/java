package com.green.java.ch07.poly;

public class Poly {
    /*
        1. 부모 타입은 자식 객체 주소값을 저장할 수 있다.
        2. 자식 타입은 부모 객체 주소값 저장할 수 없다.
        3. 타입은 (알고 있는 메소드만 호출할 수 있음)
                 (메소드를 호출 할 수 있냐 없나만 결정)
                 >> 실제로 실행되는 건 객체 기준이다.

     */
    public static void main(String[] args) {
        Animal ani1 = new Dog();
        ani1.crying();  //Dog부터 찾고 Animal로 올라가 찾는다.
//        ani1.jump();  //부모클래스 Animal에는 jump메소드가
//                     없으므로 Dog에 있어도 사용불가.

//        Dog dog1 = new Animal();
        Dog dog1 = (Dog)ani1;
        dog1.crying();
        dog1.jump();
    }
}
