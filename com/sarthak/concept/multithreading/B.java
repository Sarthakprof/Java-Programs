package com.sarthak.concept.multithreading;

public class B extends Thread{
    /*void show(){

        for(int i=0;i<=100;i++){
            System.out.println("hello");
        }
    }*/

    //now with extending thread class and using run() method it becomes a thread
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("hello");
        }
    }
}
