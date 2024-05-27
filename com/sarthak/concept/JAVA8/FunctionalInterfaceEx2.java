package com.sarthak.concept.JAVA8;

@FunctionalInterface
interface C {
    int add(int i, int j);
}

class D implements C {
    @Override
    public int add(int i, int j) {
        return i + j;
    }
}
public class FunctionalInterfaceEx2 {
    public static void main(String[] args) {

        //normal way
        C c  = new D();
        int sum = c.add(2,3);
        System.out.println(sum);

        //using anonymous inner class
        C cc = new C (){
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };
        int sum2 = cc.add(3,4);
        System.out.println(sum2);

        //using lambda expression
        //C ccc = (i, j) -> {return i+j;};
        C ccc = (i, j) ->  i+j;
        int sum3 = ccc.add(4,5);
        System.out.println(sum3);

        //using method reference
        C cccc = Integer::sum;
        int sum4 = cccc.add(4,5);
        System.out.println(sum4);

    }




}
