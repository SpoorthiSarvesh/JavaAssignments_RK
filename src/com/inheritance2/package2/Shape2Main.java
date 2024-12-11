//8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea()
//methods to calculate the area and perimeter of a circle.
package com.inheritance2.package2;

class Shape2 {

    double getPerimeter() {
        return 0; //
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape2 {
    private double radius;


    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Shape2Main {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5.0);


        System.out.println("Perimeter of the circle: " + myCircle.getPerimeter());
        System.out.println("Area of the circle: " + myCircle.getArea());
    }
}

