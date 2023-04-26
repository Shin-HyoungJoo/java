package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(1,100); //(인덱스, 값)삽입
        list.add(0,300); //(인덱스, 값)삽입
        System.out.println(list);

        int removeValue = list.remove(4);   //데이터를 지우고 인덱스의 방까지 지운다
        System.out.println("removeValue : " + removeValue);

        System.out.println(list);
    }
}
