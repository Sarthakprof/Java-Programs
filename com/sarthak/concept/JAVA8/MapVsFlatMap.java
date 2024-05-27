package com.sarthak.concept.JAVA8;

import java.util.Arrays;
import java.util.List;

public class MapVsFlatMap {

    public static void main(String[] args) {

        //map()

        List<String> words = Arrays.asList("hello", "world", "java", "stream", "example");

        // Using map() to convert each word to its length
        List<Integer> wordLengths = words.stream()
                .map(String::length) // Using method reference to map each word to its length
                .toList();

        System.out.println("Word lengths: " + wordLengths);


        //flatMap

        List<String> words1 = Arrays.asList("hello", "world", "java", "stream", "example");

        // Using flatMap() to split each word into its individual characters
        List<Character> characters = words1.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .toList();

        System.out.println("Characters: " + characters);

    }
}
