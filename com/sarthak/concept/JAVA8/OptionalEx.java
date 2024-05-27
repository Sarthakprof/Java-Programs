package com.sarthak.concept.JAVA8;

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {


        //Optional.of(value) creates an Optional object containing the specified non-null value.
        Optional<String> str = Optional.of("Hello");

        System.out.println(str.get());
        //Optional.ofNullable(value) creates an Optional object
        // that may contain a non-null value or may be empty if the specified value is null.
        Optional<String> strNull = Optional.ofNullable(null);
        System.out.println(strNull);

        //Optional.empty() creates an empty Optional object.
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        //Accessing Values
        Optional<String> optional = Optional.of("Hello");
        String value = optional.get(); // Throws NoSuchElementException if value is not present


        //orElse()
        Optional<String> optional1 = Optional.empty();
        String value1 = optional1.orElse("Default Value");
        System.out.println(value1);


        //map() & ifPresent()
        Optional<String> optional2 = Optional.of("Hello");
        optional2.map(String::toUpperCase).ifPresent(System.out::println);

        //filter()
        Optional<String> optional3 = Optional.of("Hello");
        Optional<String> filteredOptional = optional3.filter(s -> s.length() > 5);



    }
}
