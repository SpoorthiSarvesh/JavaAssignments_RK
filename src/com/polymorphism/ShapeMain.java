//3. Write a Java program to create a base class Shape with a method
//        called calculateArea(). Create three subclasses:
//Circle, Rectangle, and Triangle. Override the calculateArea() method
//in each subclass to calculate and return the shape's area.
package com.polymorphism;

// Base class Shape
abstract class Shape {
    // Abstract method to calculate area, to be implemented by subclasses
    public abstract double calculateArea();
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle = πr^2
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width; // Area of a rectangle = length * width
    }
}

// Subclass Triangle extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Area of a triangle = 0.5 * base * height
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        // Creating objects of Circle, Rectangle, and Triangle
        Shape myCircle = new Circle(5);       // Circle with radius 5
        Shape myRectangle = new Rectangle(4, 6); // Rectangle with length 4 and width 6
        Shape myTriangle = new Triangle(4, 7);  // Triangle with base 4 and height 7

        // Calculating and printing the area of each shape
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
        System.out.println("Area of Triangle: " + myTriangle.calculateArea());
    }
}
