package com.green.java.ch14;

import java.util.*;
import java.util.function.Consumer;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(item -> System.out.print(item + ", "));
        //forEach > 0,1,2,3,4,5,6,7,8,9
        System.out.println();

        list.removeIf(item -> item % 2 == 0 || item % 3 == 0); //원본에서 짝수만 제거
        list.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        list.replaceAll(item -> item * 10);
        list.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        Map<String, Object> map = new HashMap();    //<키타입,벨류타입>
        map.put("age", 27);
        map.put("name", "홍길동");
        map.put("heiget", 177.7);

        int age = (int)map.get("age");
        String name = (String)map.get("name");
        double height = (double)map.get("heiget");

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("height = " + height);
        System.out.println();

        map.forEach((key, value) -> {
            System.out.printf("%s: %s\n", key, value);
        });
    }
}
