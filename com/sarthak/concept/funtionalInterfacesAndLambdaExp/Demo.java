package com.sarthak.concept.funtionalInterfacesAndLambdaExp;

public class Demo {
    public static void main(String[] args) {

        A a = (i) ->
            // Implementation of doSomething()
            System.out.println("Doing something..." +i);
        a.show(4);

    }
}
