//5. Write a Java program to create a base class Sports with a method called play().
//Create three subclasses: Football, Basketball, and Rugby. Override the play() method
//in each subclass to play a specific statement for each sport.
package com.polymorphism;

// Base class Sports
class Sports {
    // Method in the base class
    public void play() {
        System.out.println("Playing a sport");
    }
}

// Subclass Football extending Sports
class Football extends Sports {
    // Overriding the play method for Football
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball to score a goal");
    }
}

// Subclass Basketball extending Sports
class Basketball extends Sports {
    // Overriding the play method for Basketball
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling and shooting hoops");
    }
}

// Subclass Rugby extending Sports
class Rugby extends Sports {
    // Overriding the play method for Rugby
    @Override
    public void play() {
        System.out.println("Playing Rugby: Carrying the ball to the try line");
    }
}

public class SportsMain {
    public static void main(String[] args) {
        // Creating objects of Football, Basketball, and Rugby
        Sports footballGame = new Football();   // Football game object
        Sports basketballGame = new Basketball(); // Basketball game object
        Sports rugbyGame = new Rugby();           // Rugby game object

        // Calling the play method for each sport
        footballGame.play();    // Outputs: Playing Football: Kicking the ball to score a goal
        basketballGame.play();  // Outputs: Playing Basketball: Dribbling and shooting hoops
        rugbyGame.play();       // Outputs: Playing Rugby: Carrying the ball to the try line
    }
}

