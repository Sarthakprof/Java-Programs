package com.sarthak.concept.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //both ways we can declare as below using Set or Collection
       // Set<Integer> num = new HashSet<>();
        Collection<Integer> num = new HashSet<>();
        //If you want sorted set use Treeset
       // Collection<Integer> num = new TreeSet<>();
        num.add(2);
        num.add(43);
        num.add(6);
        num.add(8);

        System.out.println(num);

        //iterating over Set

        Iterator<Integer> values = num.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
