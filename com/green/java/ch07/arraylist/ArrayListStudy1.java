package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;
//      ArrayList   = 배열, 읽는게 많으면 + 정보가 대용량이면 유리
//      LinkedList  = 노드, 수정이 많으면 유리
public class ArrayListStudy1 {
    public static void main(String[] args) {//List = 인터페이스
        List list = new ArrayList();
        list.add(10);   //0번방
        list.add(20);   //1번방
        list.add("ddd");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        int n1 = (int)list.get(0);  //.get은 오브젝트 타입이라 다 넣을수 있지만
        int n2 = (int)list.get(1);  //빼서 저장할때는 형변환 해줘야한다.(상속관련오류)
                                    //제네릭 필요의 이유 중 하나.
        String str1 = (String)list.get(2);
    }
}
