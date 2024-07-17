package com.sarthak.concept.collectionNew.others;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        System.out.println("Set: " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("SubSet: " + set.subSet("Apple", "Cherry"));
    }
}
