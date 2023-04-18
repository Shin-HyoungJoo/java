package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열 : 같은 타입의 여러 값을 저장하기 위한 공간
        int n1 = 1, n2 = 2, n3 = 3;
        int[] numArr = {10, 20, 30, 40};        //index 0, 1, 2, 3  //국룰 형태. 다른 형태로 안씀.

        numArr[0] = 11;
        int num = numArr[1];
        System.out.println("num : " + num);
    }
}