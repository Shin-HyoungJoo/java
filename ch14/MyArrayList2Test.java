package com.green.java.ch14;

public class MyArrayList2Test {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();
        //100~200

        for (int i = 100; i < 201; i++) {
            mList.add(i);
        }
        System.out.println(mList);

        final IntBox ib = new IntBox();
        int sum = 0;
        mList.forEach(item -> ib.plus(item));
        sum = ib.getSum();
        System.out.println("sum : " + sum);

        //mList의 짝수만 전부 더해서 출력
        final IntBox ib2 = new IntBox();
        mList.forEach(item -> {
            if(item % 2 == 0) {
                ib2.plus(item);
            }
        });
        sum = ib2.getSum();
        System.out.println("짝수 합 : " + sum);

        //전체 숫자 더할껀데 짝수만 *2해서 더하기
        final IntBox ib3 = new IntBox();
        mList.forEach(item -> {
            ib3.plus(item % 2 == 0 ? item * 2 : item);
        });
        sum = ib3.getSum();
        System.out.println("짝수만*2 : " + sum);
    }
}

class IntBox {
    private int sum;

    public void plus(int num) {
        this.sum += num;
    }

    public int getSum() {
        return sum;
    }
}