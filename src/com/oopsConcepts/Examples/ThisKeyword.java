package com.oopsConcepts.Examples;

public class ThisKeyword {
    int i;

   void change(int i) {
        this.i = i;
    }
    void display(){
        System.out.println("The value of i: "+i);
    }

    public static void main(String[] args) {
        ThisKeyword t1=new ThisKeyword();
        t1.change(10);
        t1.display();
        ThisKeyword t2=new ThisKeyword();
        t2.change(12);
        t2.display();

    }
}
