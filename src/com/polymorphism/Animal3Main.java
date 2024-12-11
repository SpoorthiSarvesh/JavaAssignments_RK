//10. Write a Java program to create a base class Animal with methods eat() and sound()
//    . Create three subclasses: Lion, Tiger, and Panther.
//Override the eat() method in each subclass to describe what each animal eats.
//        In addition, override the sound() method to make a specific sound for each animal.
package com.polymorphism;

// Base class Animal
abstract class Animal10 {
    // Method to describe what the animal eats
    public abstract void eat();

    // Method to describe the sound the animal makes
    public abstract void sound();
}

// Subclass Lion extending Animal10
class Lion10 extends Animal10 {
    // Overriding the eat method for Lion10
    @Override
    public void eat() {
        System.out.println("The lion eats meat, such as antelopes or zebras.");
    }

    // Overriding the sound method for Lion10
    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

// Subclass Tiger extending Animal10
class Tiger10 extends Animal10 {
    // Overriding the eat method for Tiger10
    @Override
    public void eat() {
        System.out.println("The tiger eats meat, such as deer or wild boar.");
    }

    // Overriding the sound method for Tiger10
    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

// Subclass Panther extending Animal10
class Panther10 extends Animal10 {
    // Overriding the eat method for Panther10
    @Override
    public void eat() {
        System.out.println("The panther eats meat, such as small mammals or birds.");
    }

    // Overriding the sound method for Panther10
    @Override
    public void sound() {
        System.out.println("The panther growls or roars.");
    }
}

public class Animal3Main{
    public static void main(String[] args) {
        // Creating objects of Lion10, Tiger10, and Panther10
        Animal10 lion = new Lion10();
        Animal10 tiger = new Tiger10();
        Animal10 panther = new Panther10();

        // Calling the eat and sound methods for each animal
        System.out.println("Lion:");
        lion.eat();    // Outputs: The lion eats meat, such as antelopes or zebras.
        lion.sound();  // Outputs: The lion roars.

        System.out.println("\nTiger:");
        tiger.eat();   // Outputs: The tiger eats meat, such as deer or wild boar.
        tiger.sound(); // Outputs: The tiger growls.

        System.out.println("\nPanther:");
        panther.eat(); // Outputs: The panther eats meat, such as small mammals or birds.
        panther.sound(); // Outputs: The panther growls or roars.
    }
}

