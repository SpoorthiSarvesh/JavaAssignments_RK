//1. Write a Java program to create a base class Animal (Animal Family)
//        with a method called Sound(). Create two subclasses Bird and Cat.
//Override the Sound() method in each subclass to make a specific sound for each animal.
package com.polymorphism2.package2;

class Animal {

    public void Sound() {
        System.out.println("Animal makes a sound");
    }
}


class Bird extends Animal {

    @Override
    public void Sound() {
        System.out.println("Bird chirps");
    }
}


class Cat extends Animal {

    @Override
    public void Sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalMain {
    public static void main(String[] args) {

        Animal myBird = new Bird();
        Animal myCat = new Cat();


        myBird.Sound();
        myCat.Sound();
    }
}

