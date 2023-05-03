package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {

        NumberBox nb = new NumberBox();
        int num = 10;
        nb.num = 10;
        changeNum(num);
        System.out.println(num); //10

        NumberBox nb2 = new NumberBox();
        changeNum2(nb2);
        System.out.println(nb.num); //20

        NumberBox nb3 = new NumberBox();
        NumberBox nb4 = changeNum4(nb3);

        System.out.println("nb3 : " + nb3.num);
        System.out.println("nb4 : " + nb4.num);

    }

    static void changeNum(int num) {
        num = 20;
    }

    static void changeNum2(NumberBox nb2) { //NumberBox nb2 ->변수X 객체O
        nb2.num = 20;
    }

    static NumberBox changeNum4(NumberBox nb2) { //NumberBox nb2 ->변수X 객체O
        nb2 = new NumberBox();
        nb2.num = 30;
        return nb2;
    }
}
class NumberBox {
    int num;
}