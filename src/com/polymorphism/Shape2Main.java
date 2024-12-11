//6. Write a Java program to create a class Shape with methods getArea()
//and getPerimeter(). Create three subclasses: Circle, Rectangle, and Triangle.
//Override the getArea() and getPerimeter() methods in each subclass to calculate and
//return the area and perimeter of the respective shapes.
package com.polymorphism;

// Base class Shape
abstract class Shape6 {
    // Abstract method to calculate area
    public abstract double getArea();

    // Abstract method to calculate perimeter
    public abstract double getPerimeter();
}

// Subclass Circle6 extending Shape6
class Circle6 extends Shape6 {
    private double radius;

    // Constructor to initialize radius
    public Circle6(double radius) {
        this.radius = radius;
    }

    // Overriding the getArea method for Circle6
    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // Area of circle = πr²
    }

    // Overriding the getPerimeter method for Circle6
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // Perimeter of circle = 2πr
    }
}

// Subclass Rectangle6 extending Shape6
class Rectangle6 extends Shape6 {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle6(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the getArea method for Rectangle6
    @Override
    public double getArea() {
        return length * width;  // Area of rectangle = length × width
    }

    // Overriding the getPerimeter method for Rectangle6
    @Override
    public double getPerimeter() {
        return 2 * (length + width);  // Perimeter of rectangle = 2 × (length + width)
    }
}

// Subclass Triangle6 extending Shape6
class Triangle6 extends Shape6 {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize base, height, and sides
    public Triangle6(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overriding the getArea method for Triangle6
    @Override
    public double getArea() {
        return 0.5 * base * height;  // Area of triangle = 0.5 × base × height
    }

    // Overriding the getPerimeter method for Triangle6
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;  // Perimeter of triangle = sum of sides
    }
}

public class Shape2Main {
    public static void main(String[] args) {
        // Creating objects of Circle6, Rectangle6, and Triangle6
        Shape6 circle = new Circle6(5);       // Circle with radius 5
        Shape6 rectangle = new Rectangle6(4, 6); // Rectangle with length 4 and width 6
        Shape6 triangle = new Triangle6(3, 4, 3, 4, 5);  // Triangle with base 3, height 4, and sides 3, 4, 5

        // Calculating and printing the area and perimeter of each shape
        System.out.println("Circle: ");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nRectangle: ");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nTriangle: ");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
