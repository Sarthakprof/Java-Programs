package com.sarthak.concept.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamEx {
    public static void main(String[] args) {

        //creating an arraylist of random 10K integers
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for(int i=1;i<=size; i++){
            nums.add(ran.nextInt(100));
        }
        //System.out.println(nums);

        //create a stream to multiply the numbers by 2 and add them

        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream().map(i->i*2)
                .mapToInt(i->i).sum();
        long endSeq = System.currentTimeMillis();
        //System.out.println(sum1);

        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream().map(i->i*2)
                .mapToInt(i->i).sum();
        long endPara = System.currentTimeMillis();
        //System.out.println(sum2);


        //para is taking more time
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("Para: " + (endPara - startPara));

        //what if we try and make a delay in map operation by 1 sec
        //parallel stream basically makes each thread
        //seq stream runs on one thred
        //so if we make delay in map operation parallel should run parallely


        long startSeq1 = System.currentTimeMillis();
        int sum11 = nums.stream().map(i->{
            try{Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

                    return i*2;

                })
                .mapToInt(i->i).sum();
        long endSeq1 = System.currentTimeMillis();
        //System.out.println(sum1);
//        Seq: 3
//        Para: 3

        long startPara1 = System.currentTimeMillis();
        int sum22 = nums.parallelStream().map(i->{
                    try{Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return i*2;

                })
                .mapToInt(i->i).sum();
        long endPara1 = System.currentTimeMillis();
        //System.out.println(sum2);


        //para is taking more time
        System.out.println("Seq2: " + (endSeq1 - startSeq1));
        System.out.println("Para2: " + (endPara1 - startPara1));

//        Seq2: 18332
//        Para2: 1765

    }
}
