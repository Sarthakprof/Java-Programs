package com.sarthak.concept.superKeyword;

public class Dog extends Animal {
    String name = "Dog";

    String breed;

    void display() {
        System.out.println(super.name); // Access the 'name' field from the superclass
        super.makeSound(); // Access the 'makeSound' method from the superclass
    }

    Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass 'Animal'
        this.breed = breed;
    }

}
