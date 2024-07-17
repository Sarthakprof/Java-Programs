package com.sarthak.concept.collectionNew.others;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("AA");
        linkedHashSet.add("BB");
        linkedHashSet.add("CC");
        linkedHashSet.add("DD");
        linkedHashSet.add("EE");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("BB");
        System.out.println(linkedHashSet);
        linkedHashSet.add("BB");
        System.out.println(linkedHashSet);

        System.out.print("Iterating: ");
        for (String element : linkedHashSet) {
            System.out.print(element + " ");
        }

        linkedHashSet.clear();
        System.out.println("cleared set-"+linkedHashSet);



    }
}
