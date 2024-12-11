//Write a Java program to create a class called "Rectangle" with width and
//height attributes. Calculate the area and perimeter of the rectangle.
package com.objectsAndConstructorAssignment;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return width*height;
    }
    public double calculatePerimeter(){
        return 2*(width*height);
    }
    public void printDetails(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());

    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle((int) 7.8d, (int) 9.0f);
        System.out.println("Initial Details");
        System.out.println("_____________________________");
        rectangle.printDetails();
        System.out.println("-------------------------------");
        System.out.println("Updated Details");
        rectangle.setHeight(5.7);
        rectangle.setWidth(9.1);
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println("_________________________________");
        rectangle.printDetails();




    }
}

