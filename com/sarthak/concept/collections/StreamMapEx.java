package com.sarthak.concept.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ganesh", "Mahesh", "Suresh");

        //List<String> n = names.stream().filter(name -> name.startsWith("G")).collect(Collectors.toList());

        // Using map() to transform each string to its length
        Stream<Integer> lengths = names.stream().map(String::length);

        // Collecting the result into a List
        List<Integer> lengthsList = lengths.collect(Collectors.toList());

        System.out.println(lengthsList);


        //System.out.println(n);

    }
}
