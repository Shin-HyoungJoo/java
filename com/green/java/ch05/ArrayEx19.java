package com.green.java.ch05;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        String[] titles = {"국어", "영어", "수학"};
        int[] sum = new int[score.length];
        double[] avg = new double[score.length];
        int[] subjectScore = new int[score[0].length];

        System.out.printf("번호\t\t");

        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t\t",titles[i]);
        }
        System.out.printf("총점\t\t평균\n");
        System.out.println("============================================");

        //총점
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum[i] += score[i][j];
            }
        }
        //평균
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                avg[i] = sum[i] / score[0].length;
            }
        }
        //출력
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d\t\t%3d\t\t%3d\t\t%3d\t\t%3d\t\t%.1f\t\t\n",
                    i + 1, score[i][0], score[i][1], score[i][2], sum[i], avg[i]);
        }
        //과목별 합
        for (int i = 0; i < score[0].length; i++) {     //3
            for (int j = 0; j < score.length; j++) {    //4
                subjectScore[i] += score[j][i];
            }
        }

        System.out.println("============================================");
        System.out.println("총점");

        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s: %d\n",titles[i], subjectScore[i]);
        }
    }
}