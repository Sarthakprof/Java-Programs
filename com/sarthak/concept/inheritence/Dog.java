package com.sarthak.concept.inheritence;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void doSpeak() {
        System.out.println(name  + " barks!");
    }

    public void wagTail() {
        System.out.println(name + " wags its tail.");
    }
}
