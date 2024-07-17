package com.sarthak.concept.collectionNew.others;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparatorEx {
    public static void main(String[] args) {

    // Create a PriorityQueue with a custom comparator (order by string length)
    PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));

    // Add elements to the PriorityQueue
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");
        priorityQueue.add("Date");

    // Display the elements in the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

    // Retrieve and remove the head of the PriorityQueue
        System.out.println("Removed Element: " + priorityQueue.poll());

    // Retrieve the head of the PriorityQueue without removing it
        System.out.println("Head Element: " + priorityQueue.peek());

    // Iterate over the elements in the PriorityQueue
        System.out.println("Remaining Elements:");
        while (!priorityQueue.isEmpty()) {
        System.out.println(priorityQueue.poll());
    }
}
}