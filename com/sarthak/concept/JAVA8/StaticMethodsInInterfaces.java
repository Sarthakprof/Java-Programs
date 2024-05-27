package com.sarthak.concept.JAVA8;

public interface StaticMethodsInInterfaces {
    // Abstract method (prior to Java 8)
    void abstractMethod();

    // Static method (introduced in Java 8)
    static void start(){

        System.out.println("this is a static method in interface, I provide utility, and can be accessed thru Interface name!!");
    }
}
