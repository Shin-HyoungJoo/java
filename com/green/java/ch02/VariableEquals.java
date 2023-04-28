package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2);
        System.out.println(r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println(r2);
    }
}

class NumberBox {
    private int num;
    public NumberBox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
@Override
    public boolean equals(Object obj) {
        if(!(obj instanceof NumberBox)) {
            return false;
        }
//        obj.getNum(); Object부모클래스에 getNum메소드 없어서 호출불가
    NumberBox nb = (NumberBox) obj;
    return this.num == nb.getNum();
    }
}