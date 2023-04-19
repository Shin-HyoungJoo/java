package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Time t1 = new Time();
        System.out.println("hour: " + t1.getHour());
        t1.setHour(24);
        System.out.println("hour: " + t1.getHour());
    }
}
