//8. Write a Java program to create a base class Shape with methods draw() and
// calculateArea(). Create three subclasses: Circle, Square, and Triangle.
// Override the draw() method in each subclass to draw the respective shape, and
// override the calculateArea() method to calculate and return the area of each shape.

package com.polymorphism;

// Base class Shape
abstract class Shape8 {
    // Method to draw the shape
    public abstract void draw();

    // Method to calculate and return the area of the shape
    public abstract double calculateArea();
}

// Subclass Circle8 extending Shape8
class Circle8 extends Shape8 {
    private double radius;

    // Constructor to initialize radius
    public Circle8(double radius) {
        this.radius = radius;
    }

    // Overriding the draw method for Circle8
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    // Overriding the calculateArea method for Circle8
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area of circle = πr²
    }
}

// Subclass Square8 extending Shape8
class Square8 extends Shape8 {
    private double side;

    // Constructor to initialize side length
    public Square8(double side) {
        this.side = side;
    }

    // Overriding the draw method for Square8
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }

    // Overriding the calculateArea method for Square8
    @Override
    public double calculateArea() {
        return side * side;  // Area of square = side²
    }
}

// Subclass Triangle8 extending Shape8
class Triangle8 extends Shape8 {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle8(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the draw method for Triangle8
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }

    // Overriding the calculateArea method for Triangle8
    @Override
    public double calculateArea() {
        return 0.5 * base * height;  // Area of triangle = 0.5 × base × height
    }
}

public class Shape3Main {
    public static void main(String[] args) {
        // Creating objects of Circle8, Square8, and Triangle8
        Shape8 circle = new Circle8(5);       // Circle with radius 5
        Shape8 square = new Square8(4);       // Square with side 4
        Shape8 triangle = new Triangle8(3, 4);  // Triangle with base 3 and height 4

        // Drawing each shape and calculating their area
        System.out.println("Circle8: ");
        circle.draw();    // Outputs: Drawing a Circle.
        System.out.println("Area: " + circle.calculateArea());  // Outputs: Area: 78.53981633974483

        System.out.println("\nSquare8: ");
        square.draw();    // Outputs: Drawing a Square.
        System.out.println("Area: " + square.calculateArea());  // Outputs: Area: 16.0

        System.out.println("\nTriangle8: ");
        triangle.draw();    // Outputs: Drawing a Triangle.
        System.out.println("Area: " + triangle.calculateArea());  // Outputs: Area: 6.0
    }
}
