package com.green.java.ch04.vendingmachine;

public class Drink {
    private int price;
    private String name;
    private String company;
    private int ml;

    public Drink(int price, String name, String company, int ml) {
        this.price = price;
        this.name = name;
        this.company = company;
        this.ml = ml;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getMl() {
        return ml;
    }
}
