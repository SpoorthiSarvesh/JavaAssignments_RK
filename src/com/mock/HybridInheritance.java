package com.mock;

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal can walk.");
    }
}

// Another intermediate derived class
class Bird extends Animal {
    void fly() {
        System.out.println("This bird can fly.");
    }
}

// Derived class using features from multiple intermediate classes
// This requires careful class design since Java doesn't allow multiple inheritance directly.
class Bat extends Mammal {
    void fly() {
        System.out.println("This bat can fly and walk.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        // Using Mammal
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.walk();

        // Using Bird
        Bird bird = new Bird();
        bird.eat();
        bird.fly();

        // Using Bat (inherits from Mammal and adds fly feature)
        Bat bat = new Bat();
        bat.eat();
        bat.walk();
        bat.fly();
    }
}
