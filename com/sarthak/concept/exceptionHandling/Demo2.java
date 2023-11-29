package com.sarthak.concept.exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 18;

        int result = 0;
        try {
            result = j / i;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by 0 is not allowed");
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }
    }
}
