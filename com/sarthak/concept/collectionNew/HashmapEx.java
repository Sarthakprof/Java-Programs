package com.sarthak.concept.collectionNew;

import java.util.*;
import java.util.stream.Collectors;

public class HashmapEx {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(226, "Sarthak");
        map.put(220, "Devansh");
        map.put(219, "Samrat");
        map.put(218, "Rahul");
        map.put(217, "Varun");

        //entrySet() returns a SET of key-value pair
        System.out.println(map.entrySet());
        //values() return a Collection of values
        System.out.println(map.values());
        //keySet() returns a SET of Keys in Map
        System.out.println(map.keySet());

        //size of map
        System.out.println(map.size());

        //remove an element
        map.remove(220);

        System.out.println(map.entrySet());

        map.put(220, "Devansh");

        //iterate over the Map using entrySet()  O(n) time complexity
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //iterate over Map using Key
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        //iterate over Map using values
        for(String value : map.values()){
            System.out.println(value);
        }

        //using iterator
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        System.out.println("Map using iterator-->");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //using forEach
        map.forEach((key, value) -> {
            System.out.println(key + "->" + value );
        });

        //using stream
        List<Integer> list = map.keySet().stream().filter(key->key>220).collect(Collectors.toList());
        System.out.println(list);

        List<String> list1 = map.values().stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(list1);


        map.entrySet().stream().forEach(integerStringEntry -> {
            System.out.println(integerStringEntry.getKey() + "-->" + integerStringEntry.getValue());
        });


        //trasformed map
        Map<Integer, String> transformedMap = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> transformValue(entry.getValue()) // Custom transformation function
                ));

        System.out.println(transformedMap);

        //finding a specific entry

        Optional<Map.Entry<Integer, String>> entry = map.entrySet().stream()
                .filter(e -> e.getValue().equals("Sarthak")) // Custom condition
                .findFirst();

        System.out.println(entry.isPresent());//true
    }

    private static String transformValue(String value) {

        String str = value + "suffix";
        return str;
    }
}
