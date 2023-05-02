package com.green.java.ch02;
import java.util.ArrayList;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullfileNm = "newjeans.jpg";
        String fileNm, ext;

        fileNm = fullfileNm.substring(0, fullfileNm.indexOf("."));
        ext = fullfileNm.substring(fullfileNm.indexOf(".") + 1);

        System.out.println(fileNm);
        System.out.println(ext);

    }
}