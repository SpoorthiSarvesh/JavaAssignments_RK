//2. Write a Java program to create a class Vehicle with a method called speedUp().
//Create two subclasses Car and Bicycle. Override the speedUp() method
//in each subclass to increase the vehicle's speed differently.
package com.polymorphism2.package2;


class Vehicle {

    public void speedUp() {
        System.out.println("The vehicle is speeding up");
    }
}


class Car extends Vehicle {

    @Override
    public void speedUp() {
        System.out.println("The car is speeding up by pressing the gas pedal");
    }
}


class Bicycle extends Vehicle {

    @Override
    public void speedUp() {
        System.out.println("The bicycle is speeding up by pedaling faster");
    }
}

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();


        myCar.speedUp();
        myBicycle.speedUp();
    }
}

