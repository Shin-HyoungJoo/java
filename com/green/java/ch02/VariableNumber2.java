package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리터럴 Literal = 값 그 자체
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 129;

        int i2 = b1;        //자동 형변환
        b1 = (byte) i1;     //강제형 변환(오버플로(한바퀴 돔) 주의     129 = (127 + 2) -> -128 -> -127) <byte = -128 ~ 127>
        System.out.println(b1);

        b1 = (byte)-129;    //강제형 변환(언더플로(한바퀴 돔) 주의   -129 = (-128 + (-1)) -> 127) <byte = -128 ~ 127>
        System.out.println(b1);
        //컴파일 에러
    }
}