package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public int getAbs(int num) {
        return (num >= 0 ? num : -num);
    }

    public static void main(String[] args) {
        OperatorEx32Quiz1 c1 = new OperatorEx32Quiz1();

        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        absX = c1.getAbs(x);
        absY = c1.getAbs(y);
        absZ = c1.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }
}
