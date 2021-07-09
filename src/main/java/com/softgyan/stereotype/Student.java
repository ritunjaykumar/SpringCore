package com.softgyan.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student1") // define configuration using annotation class
@Scope("prototype") //define scope of class
public class Student {
    @Value("Ritu")
    private String studentName;
    @Value("Patna")
    private String city;

    @Value("#{mobiles}")
    private List<String> mobile;

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nstudentName='" + studentName + '\'' +
                "\ncity='" + city + '\'' +
                "\nmobile=" + mobile +
                '}';
    }
}
