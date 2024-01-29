package org.example;

public class Person {
    private  Pet pet; // у каждого человека есть питомец (зависимость)
    private String name;
    private int age;


//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//
//    }
    public Person() {
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Heloow, Pet");
        pet.say();
    }

}
