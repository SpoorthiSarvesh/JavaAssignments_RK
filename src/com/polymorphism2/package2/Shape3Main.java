//8. Write a Java program to create a base class Shape with methods draw() and
// calculateArea(). Create three subclasses: Circle, Square, and Triangle.
// Override the draw() method in each subclass to draw the respective shape, and
// override the calculateArea() method to calculate and return the area of each shape.

package com.polymorphism2.package2;


abstract class Shape8 {

    public abstract void draw();


    public abstract double calculateArea();
}


class Circle8 extends Shape8 {
    private double radius;


    public Circle8(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area of circle = πr²
    }
}

class Square8 extends Shape8 {
    private double side;


    public Square8(double side) {
        this.side = side;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }


    @Override
    public double calculateArea() {
        return side * side;  // Area of square = side²
    }
}

class Triangle8 extends Shape8 {
    private double base;
    private double height;

    public Triangle8(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height;  // Area of triangle = 0.5 × base × height
    }
}

public class Shape3Main {
    public static void main(String[] args) {

        Shape8 circle = new Circle8(5);
        Shape8 square = new Square8(4);
        Shape8 triangle = new Triangle8(3, 4);


        System.out.println("Circle8: ");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("\nSquare8: ");
        square.draw();
        System.out.println("Area: " + square.calculateArea());


        System.out.println("\nTriangle8: ");
        triangle.draw();    // Outputs: Drawing a Triangle.
        System.out.println("Area: " + triangle.calculateArea());
    }
}
