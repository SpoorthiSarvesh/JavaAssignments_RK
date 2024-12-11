//1. Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.
package com.inheritance2.package2;


class Animal2 {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Cat extends Animal2 {

    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Creating an object of Cat
        Animal2 myCat = new Cat();
        myCat.makeSound();
    }
}

