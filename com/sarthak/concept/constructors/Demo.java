package com.sarthak.concept.constructors;

public class Demo {

    public static void main(String[] args) {

        Human obj = new Human();

        System.out.println(" values from default constructor: \n" + "Age: " + obj.getAge() + "\n" + "Name:" + obj.getName());

        Human obj1 = new Human(11, "B");

        System.out.println(" values from Paremeeterizzed  constructor: \n" + "Age: " + obj1.getAge() + "\n" + "Name:" + obj1.getName());

        obj.setAge(12);
        obj.setName("C");

        System.out.println(" values fafter setting in main: \n" + "Age: " + obj.getAge() + "\n" + "Name:" + obj.getName());



    }
}
