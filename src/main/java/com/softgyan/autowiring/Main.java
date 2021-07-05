package com.softgyan.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String CONFIG_PATH = "classpath:autowiring.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);

    }
}
