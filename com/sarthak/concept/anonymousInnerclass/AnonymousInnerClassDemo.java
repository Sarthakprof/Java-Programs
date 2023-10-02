package com.sarthak.concept.anonymousInnerclass;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        PrintShowClass obj = new PrintShowClass(){
            public void show() {
                System.out.println("in new show method"); //prints this
            }
        };

        obj.show();
    }
}
