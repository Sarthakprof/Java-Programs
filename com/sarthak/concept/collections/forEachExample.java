package com.sarthak.concept.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachExample {

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(6);

        List<Integer> nums = Arrays.asList(2,4,5,7,9);
       // List<Integer> nums = null;
        //different ways to iterate over list
        /*for(int i=0; i<nums.size();i++){
            System.out.println(nums.get(i));
        }*/

        /*for(int n: nums){
            System.out.println(n);
        }*/

       nums.forEach(n -> System.out.print(n));

      /*  Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };*/

      /*  Consumer<Integer> con = (n ->  System.out.println(n));*/

       // nums.forEach(con);
    }
}
