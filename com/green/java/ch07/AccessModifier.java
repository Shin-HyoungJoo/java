package com.green.java.ch07;
//348. 접근 제어자
public class AccessModifier {
    /*
    private, = 해당 클래스를 벗어나면 접근이 불가능.
                내부에선 사용가능. = 내부용
    default, = 같은 패키지 안이면 사용 가능.
    protected, = 같은 패키지, 패키지 달라도 상속관계면 접근
    public = 모두 접근 허용

    클래스는 거의 다 public. 아주 간혹 디폴트 사용.
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
//        mt1.num1 = 10;
        mt1.num2 = 20;
        mt1.num3 = 30;
        mt1.num4 = 40;

    }
}