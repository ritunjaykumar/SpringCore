package com.softgyan.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final String CONFIG_PATH = "classpath:constructor.xml";
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
