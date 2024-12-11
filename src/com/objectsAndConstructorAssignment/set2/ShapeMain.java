//16. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter,
//and subclasses for "Rectangle", "Circle", and "Triangle".
package com.objectsAndConstructorAssignment.set2;

abstract class Shape {
    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        // Rectangle example
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Circle example
        Shape circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Triangle example
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

