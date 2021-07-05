package com.softgyan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String CONFIG_PATH = "classpath:annotation.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

    }
}
