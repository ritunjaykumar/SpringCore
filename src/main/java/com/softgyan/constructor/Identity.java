package com.softgyan.constructor;

public class Identity {
    private final int id;

    public Identity(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                '}';
    }
}
