package com.green.java.ch06;

public class VarargsTest {
    static void sum(int... nums){        // 가변 인자 =  ... , 형과 변수 사이에 위치
        int sum = 0;
//        System.out.println(nums.length);
        for (int val : nums) {
            sum += val;
        }
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        sum(1);
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4,5);

        int[] arr = {1,2,3};        //가변 인자는 배열도 받아진다.
        sum(arr);
    }
}
