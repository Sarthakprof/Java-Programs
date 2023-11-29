package com.sarthak.concept.exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 18;

        int[] arr = new int[4];

        int result = 0;
        try {
            result = j / i;
            result = arr[5];
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by 0 is not allowed");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits...");
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }
    }
}
