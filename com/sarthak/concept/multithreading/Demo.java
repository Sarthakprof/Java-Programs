package com.sarthak.concept.multithreading;

public class Demo {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        //normal way of printing hi first and then hello
        //obj1.show();
        //obj2.show();
        //with start() method it call the starts the thread by running logic inside run()
        obj1.start();
        obj2.start();
    }
}
