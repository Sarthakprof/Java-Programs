package com.sarthak.concept.collectionNew;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        //add elements
        set.add("Sachin");
        set.add("Rahul");
        set.add("Sourav");
        set.add("Sehwag");

        System.out.println(set);
        //size of set
        System.out.println(set.size());

        //remove elements
        set.remove("Sehwag");

        System.out.println(set);

        //check if elements exists
        boolean hasSachin = set.contains("Sachin");

        System.out.println(hasSachin);

        //iterating over sets
        for(String s : set){
            System.out.println(s);
        }


        //using foreach
        set.forEach(element -> System.out.println(element));

        //usign iterator
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //usign stream
        set.stream().forEach(System.out::println);

        //using filter
        set.stream().filter(s -> s.startsWith("R")).forEach(System.out::println);



    }
}
