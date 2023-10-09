package com.sarthak.concept.inheritence;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Dog");

        animal.doSpeak();
        dog.doSpeak();
        dog.wagTail();

        // You can also use a reference to the parent class to store an instance of the child class
        Animal anotherDog = new Dog("Rex");
        anotherDog.doSpeak(); // Output: Rex barks!
        // But, you can't call wagTail() using anotherDog because it's not defined in Animal
    }
}
