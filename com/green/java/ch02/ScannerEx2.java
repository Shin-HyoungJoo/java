package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "신형주";
        System.out.print("나이 입력 : ");

        String input = scan.nextLine();
        int age = Integer.parseInt(input); // 문자열을 정수형으로 뱉어냄

        System.out.printf("나의 이름은 %s이고 나이는 %d살 입니다.",name , age);
        //나의 이름은 신형주이고 나이는 00살 입니다.

    }
}
