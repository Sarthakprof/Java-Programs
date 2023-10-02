package com.sarthak.concept.innerclasses;

public class OuterClass {

    private static String name = "Sarthak";

    void printName(){

        System.out.println("My Name is (Outer Class method) " + name);
    }

    static class InnerClass {

        void printNameFromInnerClass(){
            System.out.println("My Name is (Inner Class method) " + name);
        }
    }


}
