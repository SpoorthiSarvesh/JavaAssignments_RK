//1. Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.
package com.inheritance;

// Parent class
class Animal2 {
    // Method in Animal class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Cat that overrides makeSound method
class Cat extends Animal2 {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Creating an object of Cat
        Animal2 myCat = new Cat();
        myCat.makeSound();  // This will call the overridden method in Cat class
    }
}

