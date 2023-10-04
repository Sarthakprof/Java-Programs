package com.sarthak.concept.interfaces;

public class X implements A,B{

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");

    }

    @Override
    public void run() {
        System.out.println("in run");

    }
}
