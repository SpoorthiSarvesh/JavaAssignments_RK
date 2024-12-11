//2. Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package com.inheritance2.package2;


class Vehicle {

    void drive() {
        System.out.println("Vehicle is being driven");
    }
}


class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        myCar.drive();
    }
}


