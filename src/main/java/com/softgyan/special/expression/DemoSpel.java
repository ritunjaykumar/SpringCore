package com.softgyan.special.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoSpecial")
public class DemoSpel {
    @Value("#{2+2+3*6-5}")
    private int x;
    @Value("#{454-45/8}")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(9)}")
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double e;

    @Value("#{new java.lang.String('Ritunjay')}")
    private String name;

    public DemoSpel() {
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "DemoSpel{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                '}';
    }
}
