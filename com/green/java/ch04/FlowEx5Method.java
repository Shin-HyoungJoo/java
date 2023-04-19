package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj2 {
    int asd;
    String getGrade(int score) {
        String grade = "";
        if(score > 100 || score < 0){
            System.out.println("점수는 0~100점 사이입니다.");
        }else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }
        }

        int num = score % 10;

        if (grade != "D") {
            if (num >= 8 || score == 100) {
                grade += "+";
            } else if (num < 4) {
                grade += "-";
            } else {
                grade += "0";
                grade = grade + "0";
            }
        }
        return grade;
    }
}

public class FlowEx5Method {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        ScoreObj2 so = new ScoreObj2();
        String result = so.getGrade(score);
        System.out.printf("%d점의 학점은 %s입니다.", score, result);

    }
}