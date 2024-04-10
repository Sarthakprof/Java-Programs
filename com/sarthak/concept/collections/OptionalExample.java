package com.sarthak.concept.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Ganesh","Ram", "Krishna", "Laxmi", "xShiv");

        //find first name which have 'x' in them

        Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst();

        System.out.println(name.orElse("Not found!!"));

//        map and flatMap operations in a stream can be used to transform the elements.
//        When the mapping results in a potentially null value, using Optional can help handle the absence of a value more gracefully.
        List<String> namess = Arrays.asList("Alice", "Bob", "Charlie", null, "David");

        List<Optional<String>> nameOptionals = namess.stream()
                .map(Optional::ofNullable)
                .collect(Collectors.toList());

// Process elements in a way that handles null values
        nameOptionals.forEach(optional -> optional.ifPresent(System.out::println));


        List<String> namesss = Arrays.asList("Alice", "Bob", "Charlie", null, "David");

        List<String> validNames = namesss.stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println("Valid Names: " + validNames);



        //The orElse and orElseGet methods of Optional can be used to provide default values in case a value is absent during stream operations.

                List<String> namessss = Arrays.asList("Alice", "Bob", "Charlie", null, "David");

        List<String> processedNames = namessss.stream()
                .map(Optional::ofNullable)
                .map(optional -> optional.orElse("Unknown"))
                .collect(Collectors.toList());

        System.out.println("Processed Names: " + processedNames);



    }




}
