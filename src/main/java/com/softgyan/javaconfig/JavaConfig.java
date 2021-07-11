package com.softgyan.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
/*//for use this for first creating bean using component
@ComponentScan(basePackages = "com.softgyan.javaconfig")*/
public class JavaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa() ;
    }

    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student(getSamosa());
    }
}
