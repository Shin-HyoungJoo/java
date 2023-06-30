package com.green.java.ch14;

public class FightableLambdaTest {
    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        Fightable f1 = () -> {
            System.out.println("크크크");
        };

        run(f1);

        Fightable f2 = new Fightable() {    //익명 클래스
            @Override
            public void punch() {
                System.out.println("zzz");
            }
        };

        run(f2);
    }
}
