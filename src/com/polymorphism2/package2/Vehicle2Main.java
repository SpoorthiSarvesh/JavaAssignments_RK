//11. Write a Java program to create a base class Vehicle with methods startEngine() and
//stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and
//stopEngine() methods in each subclass to start and stop the engines differently.
package com.polymorphism2.package2;


abstract class Vehicle11 {

    public abstract void startEngine();


    public abstract void stopEngine();
}


class Car11 extends Vehicle11 {

    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with the push of a button.");
    }


    @Override
    public void stopEngine() {
        System.out.println("The car's engine stops with the push of a button.");
    }
}

class Motorcycle11 extends Vehicle11 {

    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a kick or press of a button.");
    }


    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine stops by pressing the engine cut-off switch.");
    }
}

public class Vehicle2Main {
    public static void main(String[] args) {

        Vehicle11 car = new Car11();
        Vehicle11 motorcycle = new Motorcycle11();


        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
