package com.softgyan.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * using interface
 */
public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    //like init method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("paying money..");
    }
}
