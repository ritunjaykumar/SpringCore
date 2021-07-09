package com.softgyan.special.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoSpecial")
public class DemoSpel {
    @Value("#{2+2+3*6-5}")
    private int x;
    @Value("#{454-45/8}")
    private int y;

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
                '}';
    }
}
