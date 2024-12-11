//4. Write a Java program to create a class called "Circle" with a radius attribute.
//You can access and modify this attribute. Calculate the area and circumference of the circle.
package com.objectsAndConstructorAssignment;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public void printDetails(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+calculateArea());
        System.out.println("Circumference: "+calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle=new Circle(3.9);
        System.out.println("Initial values");
        System.out.println("________________________________________");
        circle.printDetails();
        circle.setRadius(4.5);
        System.out.println("the new radius is "+circle.getRadius() );
        System.out.println("The new Updated");
        System.out.println("_________________________________________");
        circle.printDetails();


    }
}
