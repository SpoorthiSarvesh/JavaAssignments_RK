//8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea()
//methods to calculate the area and perimeter of a circle.
package com.inheritance;

// Parent class
class Shape2 {
    // Method to get the perimeter of a shape
    double getPerimeter() {
        return 0; // Default implementation, overridden by subclasses
    }

    // Method to get the area of a shape
    double getArea() {
        return 0; // Default implementation, overridden by subclasses
    }
}

// Subclass Circle that overrides getPerimeter and getArea methods
class Circle extends Shape2 {
    private double radius;

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding getPerimeter method to calculate the circumference of a circle
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding getArea method to calculate the area of a circle
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Shape2Main {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5
        Circle myCircle = new Circle(5.0);

        // Displaying the perimeter and area of the circle
        System.out.println("Perimeter of the circle: " + myCircle.getPerimeter());
        System.out.println("Area of the circle: " + myCircle.getArea());
    }
}

