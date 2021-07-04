package com.softgyan.first;

import com.softgyan.first.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    //    private static final String CONFIG_PATH = "file:src/main/resources/first.xml";
    private static final String CONFIG_PATH = "classpath:first.xml";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
