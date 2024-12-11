//8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
//and methods to change the color and check for red or green.

package com.objectsAndConstructorAssignment;

// TrafficLight class with color and duration attributes
class TrafficLight {
    private String color;
    private int duration;  // in seconds

    // Constructor to initialize color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }


    // Method to change the color of the traffic light
    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
        System.out.println("The traffic light is now " + color + " for " + duration + " seconds.");
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Method to display the current color and duration
    public void displayDetails() {
        System.out.println("Current light is " + color + " for " + duration + " seconds.");
    }
}

// Main class to test the TrafficLight functionality
class TrafficLightMain {
    public static void main(String[] args) {
        // Create a TrafficLight object with initial color and duration
        TrafficLight light = new TrafficLight("red", 30);

        // Display the initial state
        light.displayDetails();

        // Change the color to green and update the duration
        light.changeColor("green", 60);

        // Check if the light is red or green
        if (light.isRed()) {
            System.out.println("The light is red.");
        } else if (light.isGreen()) {
            System.out.println("The light is green.");
        }

        // Change the color to yellow
        light.changeColor("yellow", 10);

        // Display the updated state
        light.displayDetails();
    }
}