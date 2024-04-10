package com.sarthak.concept.collections;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ganesh", "Mahesh", "Suresh");

        //List<String> capNames = names.stream().map(str -> str.toUpperCase()).toList();

        //using method reference (removed lambda exp). Here String is class of toUpperCase
        List<String> capNames = names.stream().map(String::toUpperCase).toList();

        System.out.println(capNames);

        //capNames.forEach(str -> System.out.println(str));
        capNames.forEach(System.out::println);
    }
}
