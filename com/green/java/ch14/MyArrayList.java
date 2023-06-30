package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = val;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void forEach(MyConsumer consumer) {
        for (int i = 0; i < arr.length; i++) {
            consumer.accept(arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {
        return null;
    }

    @Override
    public String toString() {
        String view = "[ " + arr[0];
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                view += ", " + String.valueOf(arr[i]);
            }
        }
        view += " ]";
        return view;
    }
}
