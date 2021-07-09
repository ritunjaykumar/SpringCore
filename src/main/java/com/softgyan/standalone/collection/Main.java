package com.softgyan.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        final String CONFIG_PATH = "classpath:standalon_collection.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(".................................");
        System.out.println(person.getFriends().getClass().getName());
    }
}
