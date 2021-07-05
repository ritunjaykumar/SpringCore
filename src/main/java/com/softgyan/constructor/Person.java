package com.softgyan.constructor;

public class Person {
    private final int id;
    private final String name;
    private final Identity identity;

    public Person(int id, String name, Identity identity) {
        this.id = id;
        this.name = name;
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", identity=" + identity +
                '}';
    }
}
