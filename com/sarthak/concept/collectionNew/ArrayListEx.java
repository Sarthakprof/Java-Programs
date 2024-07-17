package com.sarthak.concept.collectionNew;

import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {

        //declare an arrayList
        List<String> strList = new ArrayList<>();

        //adding elements
        strList.add("A");
        strList.add("B");
        strList.add("C");

        //iterating over an arraylist

        //using old for loop
        for (int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }

        //using enhanced for loop
        for (String s : strList) {
            System.out.println(s);
        }

        //using iterator
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //using for each loop
        strList.forEach(element -> System.out.println(element));
        //using method reference
        strList.forEach(System.out::println);

        //using stream api
        strList.stream().forEach(System.out::println);


        //modifying list
        strList.set(0, "Z");
        strList.stream().forEach(System.out::println);

        //removing elements
        strList.remove(0);
        strList.remove("B");
        strList.stream().forEach(System.out::println);

        //size of a list
        System.out.println(strList.size());

        // Sorting elements
        List<Integer> list = Arrays.asList(1,2,4,3,7,0);

        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
