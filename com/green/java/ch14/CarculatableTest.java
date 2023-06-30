package com.green.java.ch14;

public class CarculatableTest {
    public static void main(String[] args) {
        Carculatable cc = new Carculatable() {
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        };

        int result = cc.calc(10, 20);
        System.out.println("result : " + result);

        Carculatable cc2 = (n1, n2) -> n1 + n2; //람다용 인터페이스에는 메소드 1개만 존재해야해서 유추가 가능, 구현부
        //한 줄이면 {} 생략, 두 줄 이상이면 {}필요, ;몇 개인지로 줄 구분
        int result2 = cc2.calc(20, 30);
        System.out.println("result2 : " + result2);

        Carculatable cc3 = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println("result3 : " + cc3.calc(100, 200));
    }
}
