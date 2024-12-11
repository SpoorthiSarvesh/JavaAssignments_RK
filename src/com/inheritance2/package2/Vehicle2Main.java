//
//9. Write a Java program to create a vehicle class hierarchy.
//The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
//Each subclass should have properties such as make, model, year, and fuel type.
//Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
package com.inheritance2.package2;


abstract class Vehicle2 {
    String make;
    String model;
    int year;
    String fuelType;


    Vehicle2(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }


    abstract double calculateFuelEfficiency(); // miles per gallon
    abstract double calculateDistanceTraveled(double fuelConsumed); // miles
    abstract int getMaxSpeed(); // miles per hour

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Truck extends Vehicle2 {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 8.0;
    }

    @Override
    double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    int getMaxSpeed() {
        return 80;
    }
}


class Car2 extends Vehicle2 {
    Car2(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 25.0;
    }

    @Override
    double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    int getMaxSpeed() {
        return 120;
    }
}

class Motorcycle extends Vehicle2 {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 50.0;
    }

    @Override
    double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    @Override
    int getMaxSpeed() {
        return 140;
    }
}

public class Vehicle2Main {
    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel");
        Car2 car = new Car2("Toyota", "Camry", 2021, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023, "Gasoline");


        System.out.println("=== Truck Details ===");
        truck.displayDetails();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled with 10 gallons: " + truck.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("=== Car Details ===");
        car.displayDetails();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled with 10 gallons: " + car.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("=== Motorcycle Details ===");
        motorcycle.displayDetails();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled with 10 gallons: " + motorcycle.calculateDistanceTraveled(10) + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}
