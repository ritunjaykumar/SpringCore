package com.softgyan.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static final String CONFIG_PATH = "classpath:lifecycle.xml";

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        applicationContext.registerShutdownHook();

        /*Samosa samosa = applicationContext.getBean(Samosa.class);
        System.out.println(samosa);
//registering shutdown hook
        System.out.println(".................................................");
        Pepsi pepsi = applicationContext.getBean(Pepsi.class);
        System.out.println(pepsi);
*/
        Example example = applicationContext.getBean(Example.class);
        System.out.println(example);
    }
}
