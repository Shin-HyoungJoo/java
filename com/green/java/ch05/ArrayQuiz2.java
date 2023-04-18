package com.green.java.ch05;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        int[] rNumArr = new int[6];

        for (int i = 0; i < rNumArr.length; i++) {
            int random = (int)(Math.random()*45)+1;
//            for (int j = 0; j < rNumArr.length; j++) {
//                if (rNumArr[j]==random){
//                    continue;
//                }
//            }
            rNumArr[i]=random;
        }

        for (int i = 0; i < rNumArr.length; i++) {
            System.out.printf("[%d] ",rNumArr[i]);
        }
    }
}