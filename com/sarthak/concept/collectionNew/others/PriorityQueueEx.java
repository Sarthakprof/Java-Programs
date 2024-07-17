package com.sarthak.concept.collectionNew.others;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // Create a PriorityQueue with natural ordering
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(5);

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