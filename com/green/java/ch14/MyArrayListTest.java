package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();
        mList.add(10);
        mList.add(21);
        mList.add(30);
        mList.add(41);
        mList.add(50);

        System.out.println(mList);

        mList.forEach(item -> {System.out.println(item);});
        MyArrayList mapList = mList.filter(item -> item % 2 == 0);

        System.out.println("--------------------------");
        List<Integer> realList = new ArrayList<>();
        realList.add(10);
        realList.add(20);
        realList.add(30);
        realList.forEach(item -> System.out.println(item));
    }
}