package com.green.java.ch02;

public class Naming {
    public static void main(String[] args) {
        //기법
        //Hello World Bye
        //파스칼 케이스 기법    -> 클래스명
        String HelloWorldBye;

        //카멜 케이스 기법     -> 변수명, 메소드명
        String helloWorldBye;

        //스네이크 케이스 기법
        String hello_world_bye;

        //케밥 케이스 기법
        //String heelo-world-bye;

        //자바 이름에 쓸 수 있는 특수기호 2개 : _, $
        //이름 처음에 숫자 사용할 수 없다. 처음만 아니면 된다. ex) String 1a; X      String a1a; O
        //이름에 빈칸 사용 못함. ex) String hello World;

        //대소문자 구분
        //예약어 사용 금지 (파란색상 단어는 예약어)

        //상수는 대문자, 스네이크 케이스 기법 NUM_BER_NINE
        //ex) final int MY_NUM = 13;
        //상수는 한번 값이 입력되면 수정이 불가능하다. 두 단어를 합칠 때는 언더 바_를 쓴다.
        //상수는 변수보다 속도가 빠르다. (변수는 값이 바뀌는 기능이 있기 때문.)
    }
}
