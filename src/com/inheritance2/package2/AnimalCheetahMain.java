
//6. Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.
package com.inheritance2.package2;


class Animal1 {

    void move() {
        System.out.println("Animal moves");
    }
}


class Cheetah extends Animal1 {

    @Override
    void move() {
        System.out.println("Cheetah runs");
    }
}

public class AnimalCheetahMain {
    public static void main(String[] args) {
        // Creating an object of Cheetah
        Animal1 myCheetah = new Cheetah();
        myCheetah.move();
    }
}

