package com.sarthak.concept.ObjectComparison;

public class ObjectCompareMain {

    public static void main(String[] args) {
        ObjectCompare obj1 =new ObjectCompare();
        obj1.setName("sarthak");
        obj1.setAge(10);

        ObjectCompare obj2 =new ObjectCompare();
        obj2.setName("samrat");
        obj2.setAge(11);

        ObjectCompare obj3 =new ObjectCompare();
        obj3.setName("sarthak");
        obj3.setAge(10);

        //compare obj1 and ob2 and obj3

        System.out.println(obj1.equals(obj2)); //false
        System.out.println(obj3.equals(obj2)); //false
        System.out.println(obj3.equals(obj1)); //true

        System.out.println(obj1.toString());

        System.out.println("Obj3 hashcode :" + obj3.hashCode() + "===" + "Obj1 hashcode :" + obj1.hashCode());


    }

}
