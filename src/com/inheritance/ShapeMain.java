
//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle
//that overrides the getArea() method to calculate the area of a rectangle.
package com.inheritance;

// Parent class
class Shape {
    // Method in Shape class
    double getArea() {
        return 0; // Default implementation, can be overridden by subclasses
    }
}

// Subclass Rectangle that overrides getArea method
class Rectangle extends Shape2 {
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the getArea method to calculate the area of a rectangle
    @Override
    double getArea() {
        return length * width;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        // Creating an object of Rectangle
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        System.out.println("The area of the rectangle is: " + myRectangle.getArea());
    }
}

