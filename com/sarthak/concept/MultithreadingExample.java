package com.sarthak.concept;

public class MultithreadingExample implements Runnable{

    private int threadNumber;

    public MultithreadingExample(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {

            for (int i = 0; i <= 3; i++) {
                System.out.println(i + " from thread " + threadNumber);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


    }
}
