
//12. Write a Java program to create a class called "Airplane" with a
// flight number, destination, and departure time attributes, and methods to check flight status and delay

package com.objectsAndConstructorAssignment;

import java.time.LocalTime;

public class Aiplane {
    String flightNumber;
    String destination;
    LocalTime departureTime;
    boolean delayed;

    public Aiplane(String flightNumber, String destination, LocalTime departureTime, boolean delayed) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false; // Assume no delay initially
    }
    public void checkFlightStatus(){ // Method to check if the flight is on time or delayed
        if(delayed){
            System.out.println("Flight "+flightNumber+ " to destination "+destination+" is delayed");
        }
        else {
            System.out.println("Flight "+flightNumber+" to destination "+destination+" is not delayed");
        }
    }

    public boolean setDelay(){

        return false;
    }
}
