package com.example.boxnewsfinalproject;
public class Promotion {
    private String promotion2;
    private double price;
    public String getPromotion2() {
        return promotion2;
    }
    public double getPrice() {
        return price;
    }
    public Promotion(String promotion2,double price) {
        this.promotion2 = promotion2;
        this.price = price;
    }
    public Promotion() {
    }
}
