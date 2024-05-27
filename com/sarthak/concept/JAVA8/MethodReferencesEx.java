package com.sarthak.concept.JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesEx {

    public static void main(String[] args) {

        /**
         * static Method references
         **/

        //covert an integer to string
        //Function<Integer, String> is a functional interface in Java from the java.util.function package.
        //It represents a function that takes an argument of type Integer and
        //returns a result of type String.
        //The Function interface has one abstract method called apply

        //lambda way
        Function<Integer, String> converter = (num) -> Integer.toString(num);

        System.out.println(converter.apply(2));

        //Function<Integer, String> converter2 = Integer::toString;

        // Lambda expression
        //BiFunction<Integer, Integer, Integer> maxFinder = (a, b) -> Math.max(a, b);

        // Static method reference
        BiFunction<Integer, Integer, Integer> maxFinder = Math::max;
        System.out.println(maxFinder.apply(6,3));

        /**Instance Method References of an Object: **/
        // These refer to instance methods of a particular object using the syntax object::instanceMethodName
        // Lambda expression
        //BiPredicate<String, String> predicate = (str1, str2) -> str1.equals(str2);

        // Method reference

        //BiPredicate is a functional interface that takes two params and returns boolean value
        String str1 = "Hello";
        String str2 = "Hello";
        BiPredicate<String, String> var = String::equals;
        System.out.println(var.test(str1,str2));

        // Lambda expression
        //BiFunction<String, String, Boolean> biFunction = (str1, str2) -> str1.equals(str2);

// Instance Method References of a Containing Object:

        //  The BiFunction interface in Java is a functional interface that represents
        //  a function that takes two arguments and produces a result.
        //  It's similar to the Function interface, but BiFunction specifically
        //  handles cases where you have two input values. Both interfaces are part
        //  of the java.util.function package introduced in Java 8.
        BiFunction<String, String, Boolean> biFunction = String::equals;
        biFunction.apply("Hello", "Hello");


        /**Constructor References:**/
        // These refer to constructors using the syntax ClassName::new. For example:
        // Lambda expression
        //Supplier<List<String>> supplier = () -> new ArrayList<>();

        // Method reference
        Supplier<List<String>> supplier = ArrayList::new;

       // The Supplier functional interface is part of the java.util.function package introduced in Java 8. It represents a supplier of results, meaning it does not take any arguments but produces a result of a specified type.

        //The Supplier interface has one abstract method called get(),
        // which takes no arguments and returns a result of a specified type.
        // The method signature is:
        // Supplier to generate a random integer
        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);

        // Get a random integer
        int randomNumber = randomIntegerSupplier.get();
        System.out.println("Random number: " + randomNumber);

        //The primary purpose of the Supplier interface is lazy generation of values.
        //It's often used in scenarios where you need to provide a value on demand,
       // especially in situations where the value might be expensive to compute or
        // where you want to delay the computation until it's actually needed.




    }
}
