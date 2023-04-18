package com.green.java.ch05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int[] numArr = {0, 0, 0};
        String a = "가나다라";

        for (int i = 0; i < 3; i++) {
            numArr[i] = i + 1;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " > " + numArr[i]);
        }


        System.out.println(a.length());
    }
}