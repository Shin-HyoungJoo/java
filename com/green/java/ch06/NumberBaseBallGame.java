package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {

    static int[] gerRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];
        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {
                if (arr[i] == rVal) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }


    public static int getRandomNumber2(int min, int max) {
        int random = (int) (Math.random() * max - min + 1) + min;
        return random;
    }

    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = gerRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("[Game Start]");

        int count = 0;
        while (true) {
           count++;
            int[] myArr = new int[NUMBER_COUNT];
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력", i + 1);
                myArr[i] = scan.nextInt();
            }
            int S = 0;
            int B = 0;
            int O = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int j = 0; j < NUMBER_COUNT; j++) {
                    if (numArr[j] == myArr[i]) {
                        if (i == j) {
                            S++;
                        } else {
                            B++;
                        }
                    }
                }
            }
            O = NUMBER_COUNT - (S + B);
            System.out.printf("S: %d, B: %d, O: %d\n", S, B, O);

            if (S == NUMBER_COUNT) {
                System.out.printf("[Game Over] %d", count);
                break;
            }
        }
    }
}
