package com.sarthak.concept.JAVA8;

public interface DefaultMethodInterfaceEx {

    default void start(){
        //Default Implementation
        //Default methods cannot be marked as final, abstract, or static
        //They are not the same as abstract methods.
        //Interfaces can still contain abstract methods alongside default methods.
        System.out.println("Starting the vehicle...");
    }
}
