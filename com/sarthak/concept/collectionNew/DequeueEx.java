package com.sarthak.concept.collectionNew;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addFirst("First");
        deque.addLast("Last");
        deque.add("Middle"); // Same as addLast

        // Display the deque
        System.out.println("Deque: " + deque);

        // Remove elements from the deque
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        // Peek elements
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Use as a stack
        deque.push("Stack1");
        deque.push("Stack2");
        System.out.println("Popped from Stack: " + deque.pop());

        // Final state of the deque
        System.out.println("Final Deque: " + deque);
    }
}
