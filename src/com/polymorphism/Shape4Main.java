
//12. Write a Java program to create a base class Shape with methods draw() and
//calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method
//in each subclass to draw the respective shape. In addition, override the calculateArea() method
//in the Cylinder subclass to calculate and return the total surface area of the cylinder.
package com.polymorphism;

// Base class Shape
abstract class Shape12 {
    // Abstract method to draw the shape
    public abstract void draw();

    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();
}

// Subclass Circle extending Shape12
class Circle12 extends Shape12 {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle12(double radius) {
        this.radius = radius;
    }

    // Overriding the draw method for Circle12
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // Overriding the calculateArea method for Circle12
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of the circle = π * r^2
    }
}

// Subclass Cylinder extending Shape12
class Cylinder12 extends Shape12 {
    private double radius;
    private double height;

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder12(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding the draw method for Cylinder12
    @Override
    public void draw() {
        System.out.println("Drawing a cylinder with radius " + radius + " and height " + height);
    }

    // Overriding the calculateArea method for Cylinder12
    @Override
    public double calculateArea() {
        // Surface area of a cylinder = 2πr^2 + 2πrh
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

public class Shape4Main {
    public static void main(String[] args) {
        // Creating a Circle12 object with radius 5
        Shape12 circle = new Circle12(5.0);
        // Creating a Cylinder12 object with radius 5 and height 10
        Shape12 cylinder = new Cylinder12(5.0, 10.0);

        // Drawing and calculating the area for the circle
        System.out.println("Circle:");
        circle.draw();  // Outputs: Drawing a circle with radius 5.0
        System.out.println("Area of circle: " + circle.calculateArea()); // Outputs: Area of circle: 78.53981633974483

        // Drawing and calculating the area for the cylinder
        System.out.println("\nCylinder:");
        cylinder.draw(); // Outputs: Drawing a cylinder with radius 5.0 and height 10.0
        System.out.println("Surface area of cylinder: " + cylinder.calculateArea()); // Outputs: Surface area of cylinder: 471.23889803846896
    }
}

