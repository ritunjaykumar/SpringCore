package com.softgyan.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static final String CONFIG_PATH = "classpath:collection.xml";




    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
