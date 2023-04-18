package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        float f1 = 10;      //double(8byte)정확도, float(4byte)속도, 소수(10.0)는 기본 더블형. 숫자 뒤 f를 붙여야 플롯형
        System.out.println(f1);

        f1 = (float)9.77;
        f1 = 9.77f;
        f1 = 9.77F;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1;  //자동 형변환
        System.out.println(f2);

        double d1 = 9.77d;
        double d2 = 9.77D;
    }
}

// primitive type 8개 = byte,short,int,long ~ float,double ~ char ~ boolean (리터럴값 저장함)
// 나머지 대문자로 시작 reference type (참조 타입)(주소값 저장함)