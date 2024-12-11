//7. Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera.
//Override the move() method in each subclass to describe how each animal moves.
//Also, override the makeSound() method in each subclass to make a specific sound for each animal.
package com.polymorphism2.package2;


abstract class Animal1 {

    public abstract void move();


    public abstract void makeSound();
}


class Bird1 extends Animal1 {

    @Override
    public void move() {
        System.out.println("The bird flies in the sky.");
    }


    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}


class Panthera1 extends Animal1 {

    @Override
    public void move() {
        System.out.println("The panther moves swiftly on the ground.");
    }


    @Override
    public void makeSound() {
        System.out.println("The panther roars.");
    }
}

public class Animal2Main {
    public static void main(String[] args) {

        Animal1 bird = new Bird1();
        Animal1 panthera = new Panthera1();


        System.out.println("Bird1: ");
        bird.move();
        bird.makeSound();

        System.out.println("\nPanthera1: ");
        panthera.move();
        panthera.makeSound();
    }
}

