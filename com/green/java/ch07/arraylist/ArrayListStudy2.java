package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {//<>는 래퍼클래스
        //
        int a = 10;
        Integer a2 = a;

        double d= 10.2;
        Double d2 = d;

        //제네릭 = 모든 데이터를 받는 오브젝트인 어레이 리스트를 특정 형으로
        //      지정해줌으로써 그 형의 데이터만 받게 만든다.
        ArrayList<Integer> list = new ArrayList<>();   //ArrayList는 오브젝트 타입.
//        list.add("11");
//        list.add(10.1);
//        list.add(true);
        list.add(10);
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list);   //toString 오버라이딩중
    }
}
