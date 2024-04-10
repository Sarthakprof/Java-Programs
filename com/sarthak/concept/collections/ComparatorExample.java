package com.sarthak.concept.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        /*Comparator com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else return -1;
            }
        };*/

        //we can write as a lambda function as Comparator is a functional interface
        ////Comparator com  = (i, j) -> i > j ? 1:-1;
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(14);
        list.add(8);
        list.add(1);


        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted List " +list);
       // Collections.sort(list, com);


    }
}
