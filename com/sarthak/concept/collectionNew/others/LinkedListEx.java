package com.sarthak.concept.collectionNew.others;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.add(2);
        linkedList.addLast(3);

        System.out.println(linkedList);
        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        //iterating over linkedList
        for(Object i : linkedList){
            System.out.println(i);
        }

        // Removing elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);

        // Size of the list
        System.out.println("Size: " + linkedList.size());


    }
}
