
//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle
//that overrides the getArea() method to calculate the area of a rectangle.
package com.inheritance2.package2;


class Shape {

    double getArea() {
        return 0;
    }
}


class Rectangle extends Shape2 {
    double length;
    double width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


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

