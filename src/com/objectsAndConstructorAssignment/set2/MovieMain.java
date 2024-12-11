
//17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews,
//and methods for adding and retrieving reviews.
package com.objectsAndConstructorAssignment.set2;

import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    // Constructor
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Method to add an actor
    public void addActor(String actor) {
        actors.add(actor);
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Method to retrieve all reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }

    // Method to display movie details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + String.join(", ", actors));
        System.out.println("Reviews:");
        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }
}

public class MovieMain {
    public static void main(String[] args) {
        // Create a new movie
        Movie movie = new Movie("Inception", "Christopher Nolan");

        // Add actors
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addActor("Elliot Page");

        // Add reviews
        movie.addReview("Amazing visuals and story!");
        movie.addReview("A masterpiece of modern cinema.");
        movie.addReview("Mind-bending and thought-provoking.");

        // Display movie details
        movie.displayDetails();
    }
}
