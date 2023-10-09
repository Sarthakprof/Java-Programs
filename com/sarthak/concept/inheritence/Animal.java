package com.sarthak.concept.inheritence;

public class Animal {

    String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public void doSpeak(){
        System.out.println("I am " + name + " and I speak General Language!");
    }
}
