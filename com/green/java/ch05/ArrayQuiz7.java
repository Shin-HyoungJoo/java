package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35, 80, 90};
        int[] copyArr = new int[numArr.length + 1];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        copyArr[numArr.length] = 100;

//        for (int i = 0; i < copyArr.length; i++) {
//            if(i==copyArr.length-1) {
//                copyArr[i] = 100;
//            }
//            copyArr[i] = numArr[i];
//        }

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);

            String result = Arrays.toString(copyArr);
            System.out.println(result);
        }
    }
}

