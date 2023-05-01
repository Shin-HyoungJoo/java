package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {  //중복 없는 로또 만들기
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);
        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    private static void sortArr(int[] lottoArr) {
        int temp;
        for (int i = 0; i < lottoArr.length - 1; i++) {
            for (int j = i + 1; j < lottoArr.length; j++) {
                if (lottoArr[i] > lottoArr[j]) {
                    temp = lottoArr[i];
                    lottoArr[i] = lottoArr[j];
                    lottoArr[j] = temp;
                }
            }
        }
    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1) + sVal);
    }

    public static void setRandomValuArr(int[] lottoArr) {
//        *While문의 경우*
        int num = 0;
        Loop:
        while (num < lottoArr.length) {
            int randomNum = getRandomValueFromTo(1, 45);
            for (int i = 0; i < num; i++) {
                if (lottoArr[i] == randomNum) {
                    continue Loop;
                }
            }
            lottoArr[num++] = randomNum;
        }
//        *For문의 경우*
//        for (int i = 0; i < lottoArr.length; i++) {
//            int randomNum = getRandomValueFromTo(1, 45);
//            for (int z = 0; z < lottoArr.length; z++) {
//                if (lottoArr[z] == 0) {
//                    lottoArr[z] = randomNum;
//                    break;
//                } else if (lottoArr[z] == randomNum) {
//                    i--;
//                    break;
//                }
//            }
//        }
    }


}
