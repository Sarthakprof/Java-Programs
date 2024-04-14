package com.sarthak.concept.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Current size of array-1: "+arr.size());
        System.out.println(arr);

        //print third element
        System.out.println(arr.get(2));
        //remove third element
        arr.remove(2);
        System.out.println(arr);
        System.out.println("Current size of array-2: "+arr.size());


        //To clear an arraylist
        arr.clear();
        System.out.println("ArrayList after clearing "+arr);


        List<String> names = Arrays.asList("Suresh", "Mahesh", "Ganesh");
        System.out.println("Iterate over arraylist using enhanced for loop");
        //IterateOverArrayList using enhanced for loop
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("Iterate over arraylist using foeach loop");
        names.forEach(name -> System.out.println(name));

        System.out.println("Iterate over arraylist using iterator");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterate over arraylist using java 8 stream");
        names.stream().forEach(System.out::println);
    }
}
