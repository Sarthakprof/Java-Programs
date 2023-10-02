package com.sarthak.concept;

public class MultithreadingRunner {

    public static void main(String[] args) {

        for(int i=0;i<=3;i++) {
            MultithreadingExample thread = new MultithreadingExample(i);
            Thread myThread = new Thread(thread);
            myThread.start();
        }

    }
}
