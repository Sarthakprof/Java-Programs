package com.sarthak.concept.JAVA8;

public class Example implements DefaultMethodInterfaceEx{
    // Override the default method if needed
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.start();


        StaticMethodsInInterfaces.start();
    }


}
