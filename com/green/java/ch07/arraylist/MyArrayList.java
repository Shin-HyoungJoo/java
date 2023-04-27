package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayList {
    private int[] items;//주소값 가르킴

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    public void add(int value) {//temp 한 칸 더 큰 방
        int[] temp = new int[items.length + 1];
        temp[items.length] = value; //마지막 방 대입
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(int index, int value) {
        if (index > items.length) {
            return;
        }

        int[] temp = new int[items.length + 1];
        for (int i = 0; i < index; i++) {  //이전값
            temp[i] = items[i];
        }

        for (int i = index + 1; i < items.length + 1; i++) {  //이후값
            temp[i] = items[i - 1];
        }

        temp[index] = value;     //지정 값 삽입
        items = temp;

    }

    public int size() {
        return items.length;
    }

    @Override
    public String toString() {
//        return Arrays.toString(items);

        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }

    public int get(int index) {
        return items[index];
    }

    public void bubbleSort() {

        for (int i = 0; i < items.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}


