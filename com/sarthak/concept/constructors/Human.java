package com.sarthak.concept.constructors;

public class Human extends God {

    private int age;

    private String name;
    //constructor overloading

    //default constructor
    public Human() {
        super(); //calling superclass constructor and super should always be frst stmt
        age = 10;
        name = "A";
    }

    //parameterized constructor
    public Human(int a, String n) {
        super(2); //calling super classes parameterized constructor
        this.age = a;
        this.name = n;

    }

    //getter and setters //ecapsulation

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
