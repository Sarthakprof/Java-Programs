package com.sarthak.concept.thisKeyword;

public class PersonDemo {

    public static void main(String[] args) {

        Person per = new Person("Alice");
        Person per2 = new Person("Bob");

        System.out.print(per.getName() + " and " + per2.getName());
    }
}
