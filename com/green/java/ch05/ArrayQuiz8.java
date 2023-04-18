package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        System.out.print("[");
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d", numArr[i]);
            if (i < numArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

