package com.sarthak.concept.collectionNew.others;

import java.util.LinkedHashMap;

public class LinkedHashmapEx {

    public static void main(String[] args) {

        LinkedHashMap map = new LinkedHashMap<>(16, 0.7f, true);


        map.put(1, "A");
        map.put(2, "B");

        map.put(3, "C");
        ;
        map.put(4, "D");

        //already accessed so will be accessed last now in below iteration, beacuse of doubly linked list
        map.get(1);

       // System.out.println(map);


        for (Object key : map.keySet()) {
            System.out.println(key);
        }


        LinkedHashMap<String, String> lmap = new LinkedHashMap<>(16, 0.75f, true);
        lmap.put("a", "alpha");
        lmap.put("b", "beta");
        lmap.get("a"); // "a" is now the most recently accessed
       lmap.put("c", "gamma");

// Iteration order will be: "b", "a", "c"
        for (String key : lmap.keySet()) {
            System.out.println(key);
        }


    }
}
