package com.softgyan.special.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:specialExpression.xml");
        DemoSpel demoSpecial = context.getBean("demoSpecial", DemoSpel.class);
        System.out.println(demoSpecial);


        System.out.println("-----------------------------------------------");
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("563+658");
        System.out.println(expression.getValue());
    }
}
