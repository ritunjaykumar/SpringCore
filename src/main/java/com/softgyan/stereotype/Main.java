package com.softgyan.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:stereo.xml");
        Student student = context.getBean("student1", Student.class);
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
