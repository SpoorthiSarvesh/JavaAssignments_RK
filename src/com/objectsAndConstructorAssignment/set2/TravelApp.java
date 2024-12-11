//19. Write a Java program to create a class with methods to search for
//flights and hotels, and to book and cancel reservations.
package com.objectsAndConstructorAssignment.set2;

import java.util.ArrayList;
import java.util.List;

class TravelManager {
    private List<String> availableFlights;
    private List<String> availableHotels;
    private List<String> bookedFlights;
    private List<String> bookedHotels;

    public TravelManager() {
        availableFlights = new ArrayList<>();
        availableHotels = new ArrayList<>();
        bookedFlights = new ArrayList<>();
        bookedHotels = new ArrayList<>();
        loadSampleData();
    }

    // Load sample flights and hotels
    private void loadSampleData() {
        availableFlights.add("Flight A - NYC to LA");
        availableFlights.add("Flight B - SF to Seattle");
        availableFlights.add("Flight C - Chicago to Boston");

        availableHotels.add("Hotel X - NYC");
        availableHotels.add("Hotel Y - LA");
        availableHotels.add("Hotel Z - Chicago");
    }

    // Search flights
    public void searchFlights() {
        System.out.println("Available Flights:");
        for (String flight : availableFlights) {
            System.out.println(flight);
        }
    }

    // Search hotels
    public void searchHotels() {
        System.out.println("Available Hotels:");
        for (String hotel : availableHotels) {
            System.out.println(hotel);
        }
    }

    // Book a flight
    public void bookFlight(String flight) {
        if (availableFlights.contains(flight)) {
            bookedFlights.add(flight);
            availableFlights.remove(flight);
            System.out.println("Successfully booked flight: " + flight);
        } else {
            System.out.println("Flight not available.");
        }
    }

    // Cancel a flight reservation
    public void cancelFlight(String flight) {
        if (bookedFlights.contains(flight)) {
            bookedFlights.remove(flight);
            availableFlights.add(flight);
            System.out.println("Successfully canceled flight: " + flight);
        } else {
            System.out.println("Flight reservation not found.");
        }
    }

    // Book a hotel
    public void bookHotel(String hotel) {
        if (availableHotels.contains(hotel)) {
            bookedHotels.add(hotel);
            availableHotels.remove(hotel);
            System.out.println("Successfully booked hotel: " + hotel);
        } else {
            System.out.println("Hotel not available.");
        }
    }

    // Cancel a hotel reservation
    public void cancelHotel(String hotel) {
        if (bookedHotels.contains(hotel)) {
            bookedHotels.remove(hotel);
            availableHotels.add(hotel);
            System.out.println("Successfully canceled hotel: " + hotel);
        } else {
            System.out.println("Hotel reservation not found.");
        }
    }
}

public class TravelApp {
    public static void main(String[] args) {
        TravelManager manager = new TravelManager();

        System.out.println("---- Searching Flights ----");
        manager.searchFlights();

        System.out.println("\n---- Searching Hotels ----");
        manager.searchHotels();

        System.out.println("\n---- Booking a Flight ----");
        manager.bookFlight("Flight A - NYC to LA");

        System.out.println("\n---- Booking a Hotel ----");
        manager.bookHotel("Hotel X - NYC");

        System.out.println("\n---- Canceling a Flight ----");
        manager.cancelFlight("Flight A - NYC to LA");

        System.out.println("\n---- Canceling a Hotel ----");
        manager.cancelHotel("Hotel X - NYC");
    }
}

