package com.sarthak.concept.multithreading;


import java.util.concurrent.SynchronousQueue;

class Counter{

    int count;
    
    //add synchronized to synchronize threads execution
    public synchronized void increment(){

        count++;
    }
}
public class DemoSyncRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i=0;i<22000;i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<22000;i++){
            c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
         t1.join();
         t2.join();
        System.out.println("Thread Count : " +c.count);


    }
    }

