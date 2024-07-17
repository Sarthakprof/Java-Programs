package com.sarthak.concept.collectionNew.others;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {

    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3, "Three");
        navigableMap.put(4, "Four");
        navigableMap.put(5, "Five");

        System.out.println("Navigable Map: " + navigableMap);

        System.out.println("Lower Entry (3): " + navigableMap.lowerEntry(3));
        System.out.println("Floor Entry (3): " + navigableMap.floorEntry(3));
        System.out.println("Ceiling Entry (1): " + navigableMap.ceilingEntry(1));
        System.out.println("Higher Entry (3): " + navigableMap.higherEntry(3));

        System.out.println("Poll First Entry: " + navigableMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + navigableMap.pollLastEntry());

        NavigableMap<Integer, String> descendingMap = navigableMap.descendingMap();
        System.out.println("Descending Map: " + descendingMap);

        NavigableMap<Integer, String> subMap = navigableMap.subMap(2, true, 4, true);
        System.out.println("SubMap (2 to 4 inclusive): " + subMap);

        NavigableMap<Integer, String> headMap = navigableMap.headMap(3, true);
        System.out.println("HeadMap (<=3): " + headMap);

        NavigableMap<Integer, String> tailMap = navigableMap.tailMap(3, true);
        System.out.println("TailMap (>=3): " + tailMap);
    }
}
