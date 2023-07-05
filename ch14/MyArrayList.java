package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply(int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public static MyArrayList asList(int ... i) {
        MyArrayList temp = new MyArrayList();
        for (int j = 0; j < i.length; j++) {
            temp.add(i[j]);
        }
        return temp;
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
        MyArrayList temp = new MyArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                temp.add(arr[i]);
            }
        }
        return temp;
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

    public MyArrayList map(MyFunction2 map) {
        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            temp.add(map.apply(arr[i]));
        }
        return temp;
    }

    public void removeIf(MyPredicate predicate) {
        //false로 넘어오는거 살리자
        int[] temp = new int[this.arr.length];
        int idx = 0;
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            boolean b = predicate.test(val);
            if(b == false){
                temp[idx] = val;
                idx++;
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            if(temp[i] != 0) {
                temp2[i] = temp[i];
            }
        }
        arr = temp2;
    }

    public void MyFunction2(MyFunction2 mFn) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = mFn.apply(arr[i]);
        }
        arr = temp;
    }
}
