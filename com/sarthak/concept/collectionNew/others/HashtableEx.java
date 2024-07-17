package com.sarthak.concept.collectionNew.others;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class HashtableEx {

    public static void main(String[] args) {

        Hashtable<Integer, String> hash = new Hashtable<>();

        hash.put(1, "A");
        hash.put(2, "B");
        hash.put(3, "C");
        hash.put(4, "D");

        System.out.println(hash);

        System.out.println(hash.contains("D")); //returns true

        System.out.println(hash.containsValue("D")); //returns true

        System.out.println(hash.containsKey(1)); //returns true

        hash.remove(1);

        System.out.println(hash);

        for (Integer key : hash.keySet()){

            System.out.println(key);
        }

       List<String> list =  hash.entrySet().stream().map(entry -> {

            String updatedValue = entry.getValue().toLowerCase();

            return updatedValue;

        }).collect(Collectors.toList());

        System.out.println(list);

        // Using Enumeration to iterate keys
        Enumeration<Integer> keys = hash.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key);
        }

    }
}
