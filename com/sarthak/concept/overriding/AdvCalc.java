package com.sarthak.concept.overriding;

public class AdvCalc extends Calc {
    public int add(int i, int i1) {
 int r = super.add(2,5); System.out.println(r);
    return i+i1+2;
    }
}
