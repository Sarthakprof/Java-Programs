package com.sarthak.concept.inputfromuser;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a String
        String name = scanner.nextLine();

        // Display a greeting with the user's name
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");

        // Read the user's input as a String
        int age = scanner.nextInt();

        // Display a greeting with the user's name
        System.out.println("Age of " + name + " is " + age + "!");

    }
}
