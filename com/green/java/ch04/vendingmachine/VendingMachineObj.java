package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineObj {
    private int money;
    private List<Drink> list = new ArrayList<>();

    public VendingMachineObj() {
        list = new ArrayList<>();
        list.add(new Drink(1000,"콜라","코카콜라",500));
        list.add(new Drink(1500,"사이다","칠성\t",450));
        list.add(new Drink(2000,"환타","코카콜라",500));

    }

    public void insert(int money) {
        this.money += money;
    }

    public void showMoney() {
        System.out.println("money : " + money);
    }

    public void showMenus() {
        System.out.println("번호\t 메뉴명\t 가격\t 회사\t\t 용량");
        int num = 1;
        for (Drink d : list) {
            System.out.printf("%d \t %s \t %d \t %s \t%dml\n",num++,d.getName(),d.getPrice(),d.getCompany(),d.getMl());
        }
    }

    public void purchaseDrink(int val) {
        Drink drinkNumber = list.get(val - 1);
        System.out.println(drinkNumber.getName() + "을(를) 구매하였습니다.");
        this.money -= drinkNumber.getPrice();
    }
}
