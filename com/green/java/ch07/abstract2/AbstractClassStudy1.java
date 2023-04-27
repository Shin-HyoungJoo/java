package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {//추상 메소드가 있는 순간 클래스에 추상붙이기 필수
    //객체화 막으려고 쓰기도 함
    //무조건 부모역할을 할때 쓴다 = 무조건 자식클래스가 있다

    int multi(int n1, int n2) {  //추상 클래스는 일반 메소드도 가질 수 있다.
        return n1 * n2;
    }

    abstract void sum(int n1, int n2);  //선언부만 있는 메소드, 추상 메소드는 메모리에 안올라감

}

class ChildClass extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {//추상 클래스에 있는 추상메소드는
                              // 자식클래스에 무조건 구현해야한다. = 오버라이딩 필수
        System.out.println("합계 : " + (n1 + n2));
    }
}

class Child2Class extends  AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }
}