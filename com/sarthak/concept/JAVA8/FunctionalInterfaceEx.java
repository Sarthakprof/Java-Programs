package com.sarthak.concept.JAVA8;



//creating a functional Interface A
@FunctionalInterface
interface A {
    void show(int i);
}

//How do I call method A(), in general we do it by creating a class and then we use object of b to call show()
//old way, other way is to use anonymous inner class in main()
class B implements A {

    @Override
    public void show(int i) {
        System.out.println("in show "+i);
    }
}
public class FunctionalInterfaceEx {

    public static void main(String[] args) {
        //old way of calling a functional interface method by instantiating class B
        A a = new B();
        a.show(5);

        //using anonymous inner class

        A aa = new A() {

            @Override
            public void show(int i) {
                System.out.println("in another show " +i);
            }
        };

        aa.show(4);

        //optimizing above to write using lambda exp

        A aaa = i ->  System.out.println("in another show using lambda " +i);


        aaa.show(3);
    }
}
