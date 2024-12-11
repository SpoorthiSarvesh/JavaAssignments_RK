//5. Write a Java program to create a base class Sports with a method called play().
//Create three subclasses: Football, Basketball, and Rugby. Override the play() method
//in each subclass to play a specific statement for each sport.
package com.polymorphism2.package2;

class Sports {

    public void play() {
        System.out.println("Playing a sport");
    }
}


class Football extends Sports {

    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball to score a goal");
    }
}


class Basketball extends Sports {

    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling and shooting hoops");
    }
}

class Rugby extends Sports {

    @Override
    public void play() {
        System.out.println("Playing Rugby: Carrying the ball to the try line");
    }
}

public class SportsMain {
    public static void main(String[] args) {

        Sports footballGame = new Football();
        Sports basketballGame = new Basketball();
        Sports rugbyGame = new Rugby();


        footballGame.play();
        basketballGame.play();
        rugbyGame.play();
    }
}

