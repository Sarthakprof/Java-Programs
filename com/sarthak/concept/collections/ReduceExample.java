package com.sarthak.concept.collections;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6);
        int sum = numbers.stream()
                .reduce(1, (acc, num) -> acc * num);

        System.out.println(sum);
    }
}
