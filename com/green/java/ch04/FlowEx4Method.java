package com.green.java.ch04;

import java.util.Scanner;

class ScoreQbj {
    char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        }
        return 'D';
    }
}

public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';

        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreQbj so = new ScoreQbj();
        grade = so.getGrade(score);

        System.out.printf("%d점의 학점은 %c입니다.", score, grade);
    }
}
