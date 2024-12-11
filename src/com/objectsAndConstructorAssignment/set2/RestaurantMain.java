//18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and
//ratings, and methods to add and remove items, and to calculate average rating.
package com.objectsAndConstructorAssignment.set2;

import java.util.ArrayList;
import java.util.HashMap;

class Restaurant {
    private HashMap<String, Double> menu; // Menu items and their prices
    private ArrayList<Integer> ratings;  // Ratings given to the restaurant

    // Constructor
    public Restaurant() {
        this.menu = new HashMap<>();
        this.ratings = new ArrayList<>();
    }

    // Method to add a menu item
    public void addMenuItem(String item, double price) {
        menu.put(item, price);
        System.out.println("Added item: " + item + " - $" + price);
    }

    // Method to remove a menu item
    public void removeMenuItem(String item) {
        if (menu.containsKey(item)) {
            menu.remove(item);
            System.out.println("Removed item: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    // Method to add a rating
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
            System.out.println("Added rating: " + rating);
        } else {
            System.out.println("Rating should be between 1 and 5.");
        }
    }

    // Method to calculate average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            System.out.println("No ratings available.");
            return 0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    // Method to display menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (String item : menu.keySet()) {
            System.out.println("- " + item + ": $" + menu.get(item));
        }
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add menu items
        restaurant.addMenuItem("Pasta", 12.99);
        restaurant.addMenuItem("Pizza", 9.99);
        restaurant.addMenuItem("Salad", 6.99);

        // Display menu
        restaurant.displayMenu();

        // Remove a menu item
        restaurant.removeMenuItem("Pizza");

        // Display menu again
        restaurant.displayMenu();

        // Add ratings
        restaurant.addRating(5);
        restaurant.addRating(4);
        restaurant.addRating(3);

        // Calculate and display average rating
        double avgRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + avgRating);
    }
}

