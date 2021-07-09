package com.softgyan.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feeStructures;
    private Properties properties;
    public Person() {
    }

    public List<String> getFriends() {
        return friends;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                "\nfeeStructures=" + feeStructures +
                "\nproperties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Integer> getFeeStructures() {
        return feeStructures;
    }

    public void setFeeStructures(Map<String, Integer> feeStructures) {
        this.feeStructures = feeStructures;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

}
