//Write a Java program to create a class called "MusicLibrary"
//with a collection of songs and methods to add and remove songs,
//and to play a random song.
package com.objectsAndConstructorAssignment.set2;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private ArrayList<String> songs = new ArrayList<>();

    // Add a song
    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " added to the library.");
    }

    // Remove a song
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " removed from the library.");
        } else {
            System.out.println(song + " is not found in the library.");
        }
    }

    // Play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty. Add some songs first!");
        } else {
            Random random = new Random();
            String randomSong = songs.get(random.nextInt(songs.size()));
            System.out.println("Now playing: " + randomSong);
        }
    }

    // Display all songs
    public void displaySongs() {
        System.out.println("\nMusic Library:");
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            for (String song : songs) {
                System.out.println("- " + song);
            }
        }
    }
}

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        // Add songs
        musicLibrary.addSong("Shape of You");
        musicLibrary.addSong("Blinding Lights");
        musicLibrary.addSong("Bohemian Rhapsody");

        // Display songs
        musicLibrary.displaySongs();

        // Play a random song
        musicLibrary.playRandomSong();

        // Remove a song
        musicLibrary.removeSong("Blinding Lights");

        // Display songs again
        musicLibrary.displaySongs();
    }
}

