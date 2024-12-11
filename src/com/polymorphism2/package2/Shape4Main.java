
//12. Write a Java program to create a base class Shape with methods draw() and
//calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method
//in each subclass to draw the respective shape. In addition, override the calculateArea() method
//in the Cylinder subclass to calculate and return the total surface area of the cylinder.
package com.polymorphism2.package2;


abstract class Shape12 {

    public abstract void draw();


    public abstract double calculateArea();
}


class Circle12 extends Shape12 {
    private double radius;


    public Circle12(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of the circle = π * r^2
    }
}


class Cylinder12 extends Shape12 {
    private double radius;
    private double height;


    public Cylinder12(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a cylinder with radius " + radius + " and height " + height);
    }


    @Override
    public double calculateArea() {
        // Surface area of a cylinder = 2πr^2 + 2πrh
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

public class Shape4Main {
    public static void main(String[] args) {

        Shape12 circle = new Circle12(5.0);

        Shape12 cylinder = new Cylinder12(5.0, 10.0);


        System.out.println("Circle:");
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());


        System.out.println("\nCylinder:");
        cylinder.draw();
        System.out.println("Surface area of cylinder: " + cylinder.calculateArea());
    }
}

