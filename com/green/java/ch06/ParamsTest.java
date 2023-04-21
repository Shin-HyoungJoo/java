package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {

        int num = 20;
        changeNum(num);
        System.out.println(num); //10

        NumberBox nb = new NumberBox();
        NumberBox nb2 = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num); //20

    }

    static void changeNum(int num) {
        num = 20;
    }

    static void changeNum2(NumberBox nb2) { //NumberBox nb2 ->변수X 객체O
        nb2.num = 20;
    }
}

class NumberBox {
    int num;
}