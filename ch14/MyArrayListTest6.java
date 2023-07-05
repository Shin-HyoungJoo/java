package com.green.java.ch14;

public class MyArrayListTest6 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            ma.add(i);
        }
        System.out.println(ma);

        ma.removeIf(item -> item % 2 == 0);
        System.out.println(ma);

        MyFunction2 mFn = item -> item * 10;
        ma.MyFunction2(mFn);
        System.out.println(ma);
    }
}
