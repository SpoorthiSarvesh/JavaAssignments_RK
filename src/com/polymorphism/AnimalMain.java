//1. Write a Java program to create a base class Animal (Animal Family)
//        with a method called Sound(). Create two subclasses Bird and Cat.
//Override the Sound() method in each subclass to make a specific sound for each animal.
package com.polymorphism;

// Base class Animal
class Animal {
    // Method in the base class
    public void Sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Bird extending Animal
class Bird extends Animal {
    // Overriding the Sound method in Bird class
    @Override
    public void Sound() {
        System.out.println("Bird chirps");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    // Overriding the Sound method in Cat class
    @Override
    public void Sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Creating objects of Bird and Cat
        Animal myBird = new Bird();  // Creating Bird object
        Animal myCat = new Cat();    // Creating Cat object

        // Calling the Sound method on each object
        myBird.Sound(); // Outputs: Bird chirps
        myCat.Sound();  // Outputs: Cat meows
    }
}

