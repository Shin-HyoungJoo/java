package com.green.java.ch14;

public class FightableTest {
    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        StreetFighter fighter = new StreetFighter();
        run(fighter);

        run(new Fightable() {   //익명 클래스
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        Fightable f1 = new Fightable() {    //익명 클래스
            @Override
            public void punch() {
                System.out.println("크크크");
            }
        };
    }
}

class StreetFighter implements Fightable {
    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }
}