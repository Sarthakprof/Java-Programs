package com.sarthak.concept.collections;

import java.util.Optional;

public class OptionalExample2 {

    public static void main(String[] args) {
        Optional<String> nonNullOptional = Optional.of("Hello");


        //beelow gives NPE
        //Optional<String> nonNullOptional = Optional.of(null);


        //below does not give NPE, shows Optional.empty in output
        Optional<String> nullableOptional = Optional.ofNullable(null);

        System.out.println("nonNullOptional -->" + nonNullOptional);


        System.out.println("nullableOptional -->" + nullableOptional);

        String value = nonNullOptional.get();
        String orElseValue = nullableOptional.orElse("Default");
        //String orElseGetValue = nullableOptional.orElseGet(() -> expensiveOperation());
        //String orElseThrowValue = nullableOptional.orElseThrow(() -> new NoSuchElementException("Value not present"));


        System.out.println(value + "  " + orElseValue);


        Optional<String> s = Optional.of("Hello");
        //Optional<Integer> length = s.map(str->str.length());
        Optional<Integer> length = s.map(String::length);


        Optional<String> filteredOptional = s.filter(val -> val.length() > 5);

    }
}
