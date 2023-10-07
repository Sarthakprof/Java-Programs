package com.sarthak.concept.thisKeyword;

public class Person {

    //declaring variables
    private String name;
    private int age;

    //constructor
    public Person(String name){
        this.name = name;
    }

    //getter and setter for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
