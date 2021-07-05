package com.softgyan.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * using annotation
 */
public class Example {
    private String subject;

    public Example() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}

