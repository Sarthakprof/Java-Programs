package com.sarthak.concept.encapsulation;

public class PersonDemo {

    public static void main(String[] args) {

        Person papa = new Person();
        papa.setName("Papa");
        papa.setAge(70);

        Person mummy = new Person();
        mummy.setName("Mummy");
        mummy.setAge(60);

        System.out.println("Name of Parents are : " + papa.getName() + " and " + mummy.getName());
    }
}
