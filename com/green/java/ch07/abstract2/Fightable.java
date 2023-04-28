package com.green.java.ch07.abstract2;

//무조건 추상 메소드만 줄 수 있기 때문에 굳이 메소드에 abstract 안적어도된다.
//메소드 앞에 public abstract 자동으로 숨겨져서 붙기때문에 안붙여도된다.
//추상클래스처럼 상속한 자식클래스에 무조건 인터페이스 안의 <같은 메소드>가 있어야 한다.
//인터페이스는 <다중 상속>이 된다. => implements name1, name2 ....
//상속한 클래스들의 규격 같은 개념
public interface Fightable {    //작명 ~able
    void sum(int x, int y);
    void move(int x, int y);
}
