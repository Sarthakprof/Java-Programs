package com.sarthak.concept.collectionNew.others;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(3);
        sortedSet.add(1);
        sortedSet.add(2);

        System.out.println("Sorted Set: " + sortedSet);

        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());

        SortedSet<Integer> subSet = sortedSet.subSet(1, 3);
        System.out.println("SubSet (1 to 3): " + subSet);

        SortedSet<Integer> headSet = sortedSet.headSet(2);
        System.out.println("HeadSet (less than 2): " + headSet);

        SortedSet<Integer> tailSet = sortedSet.tailSet(2);
        System.out.println("TailSet (2 and more): " + tailSet);

        Comparator<? super Integer> comparator = sortedSet.comparator();
        if (comparator == null) {
            System.out.println("The set uses natural ordering.");
        } else {
            System.out.println("The set uses a custom comparator.");
        }
    }
}