package com.mock;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();

    // Concrete method (with body)
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Create objects of subclasses
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call methods
        dog.sound(); // Output: Dog barks
        dog.sleep(); // Output: Sleeping...

        cat.sound(); // Output: Cat meows
        cat.sleep(); // Output: Sleeping...
    }
}

