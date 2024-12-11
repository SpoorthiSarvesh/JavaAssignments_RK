//10. Write a Java program to create a base class Animal with methods eat() and sound()
//    . Create three subclasses: Lion, Tiger, and Panther.
//Override the eat() method in each subclass to describe what each animal eats.
//        In addition, override the sound() method to make a specific sound for each animal.
package com.polymorphism2.package2;


abstract class Animal10 {

    public abstract void eat();


    public abstract void sound();
}

class Lion10 extends Animal10 {

    @Override
    public void eat() {
        System.out.println("The lion eats meat, such as antelopes or zebras.");
    }


    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

class Tiger10 extends Animal10 {

    @Override
    public void eat() {
        System.out.println("The tiger eats meat, such as deer or wild boar.");
    }


    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

class Panther10 extends Animal10 {

    @Override
    public void eat() {
        System.out.println("The panther eats meat, such as small mammals or birds.");
    }


    @Override
    public void sound() {
        System.out.println("The panther growls or roars.");
    }
}

public class Animal3Main{
    public static void main(String[] args) {

        Animal10 lion = new Lion10();
        Animal10 tiger = new Tiger10();
        Animal10 panther = new Panther10();


        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}

