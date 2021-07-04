package com.softgyan.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> importantDates;
    private Map<String, Object> courses;

    public Employee() {
    }

    public Employee(String name, List<String> phones, Set<String> importantDates,
                    Map<String, Object> courses) {
        this.name = name;
        this.phones = phones;
        this.importantDates = importantDates;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getImportantDates() {
        return importantDates;
    }

    public void setImportantDates(Set<String> importantDates) {
        this.importantDates = importantDates;
    }

    public Map<String, Object> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Object> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "\nname='" + name + '\'' +
                "\nphones=" + phones +
                "\nimportantDates=" + importantDates +
                "\ncourses=" + courses +
                '}';
    }
}
