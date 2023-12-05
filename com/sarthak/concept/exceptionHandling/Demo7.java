package com.sarthak.concept.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo7 {

    //try and finally
    //finally block is mostly used to close the connection
    // Create a BufferedReader using InputStreamReader to read from System.in
    public static void main(String[] args) {
        // Create a BufferedReader using InputStreamReader to read from System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user to enter their name
            System.out.print("Enter your name: ");

            // Read the input from the user
            String name = reader.readLine();

            // Display a greeting
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedReader
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }
    }
}


