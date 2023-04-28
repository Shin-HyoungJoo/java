package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
        try {                          //예외가 발생될 가능성이 있는 로직(source) 위치
            int r1 = 10 / 0;           //에러발생. println문 건너뛰고 catch로 이동
            System.out.println("다음줄");

        } catch (Exception e) {         //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
            e.printStackTrace();        //에러문 출력
            System.out.println("예외 발생!");

        } finally {                      //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
            System.out.println("파이널리");
        }

        System.out.println("끝!");

    }
}