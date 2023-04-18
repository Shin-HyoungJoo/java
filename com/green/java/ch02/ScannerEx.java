package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Scanner 클릭하고 Alt+Enter

        System.out.print("두자리 정수를 하나 입력해 주세요.");
        String input = scan.nextLine();
        int num = Integer.parseInt(input); // 문자열을 정수형으로 뱉어냄

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d", num);
    }
}
