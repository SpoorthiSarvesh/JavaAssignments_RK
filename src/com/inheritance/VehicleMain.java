//2. Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package com.inheritance;

// Parent class
class Vehicle {
    // Method in Vehicle class
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

// Subclass Car that overrides drive method
class Car extends Vehicle {
    // Overriding the drive method
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Creating an object of Car
        Vehicle myCar = new Car();
        myCar.drive();  // This will call the overridden method in Car class
    }
}


