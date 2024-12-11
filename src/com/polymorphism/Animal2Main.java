//7. Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera.
//Override the move() method in each subclass to describe how each animal moves.
//Also, override the makeSound() method in each subclass to make a specific sound for each animal.
package com.polymorphism;

// Base class Animal
abstract class Animal1 {
    // Method to describe how the animal moves
    public abstract void move();

    // Method to describe the sound the animal makes
    public abstract void makeSound();
}

// Subclass Bird1 extending Animal1
class Bird1 extends Animal1 {
    // Overriding the move method for Bird1
    @Override
    public void move() {
        System.out.println("The bird flies in the sky.");
    }

    // Overriding the makeSound method for Bird1
    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}

// Subclass Panthera1 extending Animal1
class Panthera1 extends Animal1 {
    // Overriding the move method for Panthera1
    @Override
    public void move() {
        System.out.println("The panther moves swiftly on the ground.");
    }

    // Overriding the makeSound method for Panthera1
    @Override
    public void makeSound() {
        System.out.println("The panther roars.");
    }
}

public class Animal2Main {
    public static void main(String[] args) {
        // Creating objects of Bird1 and Panthera1
        Animal1 bird = new Bird1();       // Bird1 object
        Animal1 panthera = new Panthera1(); // Panthera1 object

        // Calling the move and makeSound methods for each animal
        System.out.println("Bird1: ");
        bird.move();    // Outputs: The bird flies in the sky.
        bird.makeSound();  // Outputs: The bird chirps.

        System.out.println("\nPanthera1: ");
        panthera.move();    // Outputs: The panther moves swiftly on the ground.
        panthera.makeSound();  // Outputs: The panther roars.
    }
}

