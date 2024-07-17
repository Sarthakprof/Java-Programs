package com.sarthak.concept.collectionNew.others;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(1);
        navigableSet.add(2);
        navigableSet.add(3);
        navigableSet.add(4);
        navigableSet.add(5);

        System.out.println("Navigable Set: " + navigableSet);

        System.out.println("Lower(3): " + navigableSet.lower(3));  // 2
        System.out.println("Floor(3): " + navigableSet.floor(3));  // 3
        System.out.println("Ceiling(3): " + navigableSet.ceiling(3));  // 3
        System.out.println("Higher(3): " + navigableSet.higher(3));  // 4

        System.out.println("Poll First: " + navigableSet.pollFirst());  // 1
        System.out.println("Poll Last: " + navigableSet.pollLast());  // 5

        NavigableSet<Integer> descendingSet = navigableSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet);

        NavigableSet<Integer> subSet = navigableSet.subSet(2, true, 4, true);
        System.out.println("Sub Set (2 to 4 inclusive): " + subSet);

        NavigableSet<Integer> headSet = navigableSet.headSet(3, true);
        System.out.println("Head Set (<=3): " + headSet);

        NavigableSet<Integer> tailSet = navigableSet.tailSet(3, true);
        System.out.println("Tail Set (>=3): " + tailSet);
    }
}
