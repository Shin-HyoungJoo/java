package com.green.java.ch02;

public class VariableChar {                                 //UTF-8(유니코드 트랜스퍼 포맷) 사용. ASCII 코드 사용X
    public static void main(String[] args) {
        //변수 선언과 초기화 동시 가능
        char c1 = 'A';  //문자만, 문자열X, 홑따옴표 사용.
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);

        c1 = 'B';
        System.out.printf("%c : %d \n", c1, (int)c1); // 형태선언 + 형태에 넣을 변수이름=printf
    }                           //decimal
}
