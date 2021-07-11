package com.softgyan.javaconfig;

import org.springframework.stereotype.Component;

/*//creating bean using @Component -> this is first way
@Component("student")*/
public class Student {
    public void study() {
        System.out.println("student is reading a book");
    }

    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
