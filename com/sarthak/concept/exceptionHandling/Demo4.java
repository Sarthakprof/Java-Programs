package com.sarthak.concept.exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName(null);
        try{
            //if u remove null check then goes to exception block as name is NUll
          if(p.getName() !=null && p.getName().equals("Sarthak")){
              System.out.print("Sarthak is here");
          }
          else{
                System.out.print("Sarthak is NOT here");
            }
        }
        catch (NullPointerException e){

            System.out.print("NPE!! Abort Abort!");

        }
    }
}
