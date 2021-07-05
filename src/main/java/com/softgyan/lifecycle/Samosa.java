package com.softgyan.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setter method");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
