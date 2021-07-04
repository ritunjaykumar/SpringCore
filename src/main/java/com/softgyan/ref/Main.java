package com.softgyan.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Main {
    private static final String CONFIG_PATH = "classpath:ref.xml";
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Line line = applicationContext.getBean(Line.class);
        System.out.printf(String.format("distance %.2f units%n",line.getDistance()));

    }
}
