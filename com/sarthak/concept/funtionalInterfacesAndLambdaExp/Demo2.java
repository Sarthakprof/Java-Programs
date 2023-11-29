package com.sarthak.concept.funtionalInterfacesAndLambdaExp;

public class Demo2 {
    public static void main(String[] args) {

        //lambda expression
        B b = (i, j) -> i + j;
        int result = b.add(2, 3);
        System.out.println("in add: " + result);
    }
}
