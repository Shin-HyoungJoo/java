package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);   //0번방
        list.add(20);   //1번방
        list.add("ddd");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        int n1 = (int)list.get(0);  //.get은 오브젝트 타입이라 다 넣을수 있지만
        int n2 = (int)list.get(1);  //빼서 저장할때는 형변환 해줘야한다.(상속관련오류)
        String str1 = (String)list.get(2);
    }
}
