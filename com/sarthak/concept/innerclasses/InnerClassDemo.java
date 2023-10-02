package com.sarthak.concept.innerclasses;

public class InnerClassDemo {

    public static void main (String arg[]){

        OuterClass obj = new OuterClass();

        obj.printName();

        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();

        obj1.printNameFromInnerClass();

    }
}
