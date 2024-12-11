
//6. Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.
package com.inheritance;

// Parent class
class Animal1 {
    // Method in Animal class
    void move() {
        System.out.println("Animal moves");
    }
}

// Subclass Cheetah that overrides move method
class Cheetah extends Animal1 {
    // Overriding the move method
    @Override
    void move() {
        System.out.println("Cheetah runs");
    }
}

public class AnimalCheetahMain {
    public static void main(String[] args) {
        // Creating an object of Cheetah
        Animal1 myCheetah = new Cheetah();
        myCheetah.move();  // This will call the overridden move method in Cheetah class
    }
}

