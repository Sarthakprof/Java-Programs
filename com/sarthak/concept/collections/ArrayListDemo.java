package com.sarthak.concept.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Current size of array-1: "+arr.size());
        System.out.println(arr);

        //print third element
        System.out.println(arr.get(2));
        //remove third element
        arr.remove(2);
        System.out.println(arr);
        System.out.println("Current size of array-2: "+arr.size());


        //To clear an arraylist
        arr.clear();
        System.out.println("ArrayList after clearing "+arr);

    }
}
