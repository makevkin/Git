package org.example;

public class Dog implements Pet{
    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  say() {
        System.out.println("gaw-gaw");
    };
}
