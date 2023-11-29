package com.sarthak.concept.exceptionHandling;

public class Demo1 {

    public static void main(String[] args) {

        int i = 0;
        int j = 18;

        int result = 0;
        try {
            result = j / i;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }



    }
}
