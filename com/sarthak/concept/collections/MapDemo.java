package com.sarthak.concept.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> report = new HashMap<>();
        //for Sychnozed, use HashTable (slower in performance)
       // Map<String, Integer> fruit = new HashTable<>();

        report.put("Sarthak", 89);
        report.put("Samrat",87);
        report.put("Devansh", 59);
        report.put("Varun",37);
        report.put("Rahul", 79);

        System.out.println(report);
        //keys are unique so they are representing Set
        //values can be duplicates so they represent a List

        //iteration of map using key
        for(String key: report.keySet()){
            System.out.println(key + " : " + report.get(key));
        }

        System.out.println(report.size());
        System.out.println(report.keySet());
        System.out.println(report.values());

        System.out.println(report.replace("Sarthak", 90));
        System.out.println(report.entrySet());
        report.clear();
        System.out.println(report.entrySet());
    }
}
