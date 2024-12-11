//11. Write a Java program to create a base class Vehicle with methods startEngine() and
//stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and
//stopEngine() methods in each subclass to start and stop the engines differently.
package com.polymorphism;

// Base class Vehicle
abstract class Vehicle11 {
    // Method to start the engine
    public abstract void startEngine();

    // Method to stop the engine
    public abstract void stopEngine();
}

// Subclass Car extending Vehicle11
class Car11 extends Vehicle11 {
    // Overriding the startEngine method for Car11
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with the push of a button.");
    }

    // Overriding the stopEngine method for Car11
    @Override
    public void stopEngine() {
        System.out.println("The car's engine stops with the push of a button.");
    }
}

// Subclass Motorcycle extending Vehicle11
class Motorcycle11 extends Vehicle11 {
    // Overriding the startEngine method for Motorcycle11
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a kick or press of a button.");
    }

    // Overriding the stopEngine method for Motorcycle11
    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine stops by pressing the engine cut-off switch.");
    }
}

public class Vehicle2Main {
    public static void main(String[] args) {
        // Creating objects of Car11 and Motorcycle11
        Vehicle11 car = new Car11();
        Vehicle11 motorcycle = new Motorcycle11();

        // Starting and stopping the engines of both vehicles
        System.out.println("Car:");
        car.startEngine();    // Outputs: The car's engine starts with the push of a button.
        car.stopEngine();     // Outputs: The car's engine stops with the push of a button.

        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();  // Outputs: The motorcycle's engine starts with a kick or press of a button.
        motorcycle.stopEngine();   // Outputs: The motorcycle's engine stops by pressing the engine cut-off switch.
    }
}

