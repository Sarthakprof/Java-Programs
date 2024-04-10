package com.sarthak.concept.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Result: [2, 4, 6, 8, 10]


        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        List<String> shortWords = words.stream()
                .filter(word -> word.length() <= 5)
                .collect(Collectors.toList());

        // Result: ["apple", "kiwi"]

        List<Integer> num = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9, 10);

        List<Integer> distinctNumbers = num.stream()
                .distinct()
                .collect(Collectors.toList());

// Result: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        List<String> wordss = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        List<String> filteredWords = wordss.stream()
                .filter(word -> word.startsWith("a") && word.length() > 4)
                .collect(Collectors.toList());

// Result: ["apple"]


    }
}
