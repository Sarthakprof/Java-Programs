package com.sarthak.concept.funtionalInterfacesAndLambdaExp;

public class DemoLambda {
    public static void main(String[] args) {

        A a = (i) -> System.out.println("in show " +i);

        a.show(5);
    }
}
