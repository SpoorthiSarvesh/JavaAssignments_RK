//3. Write a Java program to create a base class Shape with a method
//        called calculateArea(). Create three subclasses:
//Circle, Rectangle, and Triangle. Override the calculateArea() method
//in each subclass to calculate and return the shape's area.
package com.polymorphism2.package2;


abstract class Shape {

    public abstract double calculateArea();
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle = πr^2
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Area of a triangle = 0.5 * base * height
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5);
        Shape myRectangle = new Rectangle(4, 6);
        Shape myTriangle = new Triangle(4, 7);


        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
        System.out.println("Area of Triangle: " + myTriangle.calculateArea());
    }
}
