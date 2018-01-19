package com.mounacheikhna.perfplayground;

public class Value {

    private String name;

    public Value(String name) {
        System.out.println("Ctor of value "+ name + " has been called");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                '}';
    }
}
