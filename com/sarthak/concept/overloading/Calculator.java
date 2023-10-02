package com.sarthak.concept.overloading;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 3);
        double sum2 = calculator.add(2.5, 3.7);
        int sum3 = calculator.add(1, 2, 3);

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }
}

