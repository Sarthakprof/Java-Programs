package com.sarthak.concept.collectionNew;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("First");
        queue.offer("Second");
        queue.add("Third");
        queue.offer("Fourth");

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing elements from the queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Retrieving elements without removing
        String headElement = queue.element();
        System.out.println("Head Element (element method): " + headElement);
        headElement = queue.peek();
        System.out.println("Head Element (peek method): " + headElement);

        // Polling elements from the queue
        String polledElement = queue.poll();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Queue after polling: " + queue);
    }
}