package com.sarthak.concept.collectionNew.others;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {

    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(3, "Three");
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");

        System.out.println("Sorted Map: " + sortedMap);

        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());

        SortedMap<Integer, String> subMap = sortedMap.subMap(1, 3);
        System.out.println("SubMap (1 to 3): " + subMap);

        SortedMap<Integer, String> headMap = sortedMap.headMap(2);
        System.out.println("HeadMap (less than 2): " + headMap);

        SortedMap<Integer, String> tailMap = sortedMap.tailMap(2);
        System.out.println("TailMap (2 and more): " + tailMap);
    }
}
