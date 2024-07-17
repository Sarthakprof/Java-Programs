package com.sarthak.concept.collectionNew.others;

import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        //values are not unique in treemap but in sorted key
        //in treeset values are also unique

        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Three");

        System.out.println("Map: " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("SubMap: " + map.subMap(1, 3));
    }
}
