package com.bootcoding.project.module;

public class ordermenu {
    int id;
    int numberofmenu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberofmenu() {
        return numberofmenu;
    }

    public void setNumberofmenu(int numberofmenu) {
        this.numberofmenu = numberofmenu;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    double totalPrice;
}
