//2. Write a Java program to create a class Vehicle with a method called speedUp().
//Create two subclasses Car and Bicycle. Override the speedUp() method
//in each subclass to increase the vehicle's speed differently.
package com.polymorphism;

// Base class Vehicle
class Vehicle {
    // Method in the base class
    public void speedUp() {
        System.out.println("The vehicle is speeding up");
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    // Overriding the speedUp method in Car class
    @Override
    public void speedUp() {
        System.out.println("The car is speeding up by pressing the gas pedal");
    }
}

// Subclass Bicycle extending Vehicle
class Bicycle extends Vehicle {
    // Overriding the speedUp method in Bicycle class
    @Override
    public void speedUp() {
        System.out.println("The bicycle is speeding up by pedaling faster");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Creating objects of Car and Bicycle
        Vehicle myCar = new Car();       // Creating Car object
        Vehicle myBicycle = new Bicycle(); // Creating Bicycle object

        // Calling the speedUp method on each object
        myCar.speedUp();      // Outputs: The car is speeding up by pressing the gas pedal
        myBicycle.speedUp();  // Outputs: The bicycle is speeding up by pedaling faster
    }
}

