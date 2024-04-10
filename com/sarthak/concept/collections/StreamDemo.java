package com.sarthak.concept.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,3,5,7,9);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n->n*2);
        int result = s3.reduce(0, (c,e)->c+e);

        System.out.print(result);
    }
}
