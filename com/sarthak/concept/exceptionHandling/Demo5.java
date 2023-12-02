package com.sarthak.concept.exceptionHandling;

public class Demo5 {

    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("The value of j is zero as value of i is greaster than 18");
            }

        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Dont divide by 0 & "+e);

        } catch (Exception e) {

            System.out.println("Some exction occured");

        }
        System.out.println(j);
    }
}
