//5. Write a Java program to create a class called "Book"
//with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
package com.objectsAndConstructorAssignment;

public class Books {
    private String title;
    private String author;
    private String ISBN;

    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
class LibraryMain1 {
    public static void main(String[] args) {
        // Create Book objects
        Books books1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Books books2 = new Books("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Books books3 = new Books("1984", "George Orwell", "9780451524935");

        // Display details of each book
        System.out.println("Book 1 Details:");
        books1.displayBookDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        books2.displayBookDetails();
        System.out.println();

        System.out.println("Book 3 Details:");
        books3.displayBookDetails();
        System.out.println();

        // Modify details of book2
        System.out.println("Updating Book 2 Details:");
        books2.setTitle("To Kill a Mockingbird - Updated Edition");
        books2.setAuthor("Harper Lee");
        books2.setISBN("9780060935467");
        books2.displayBookDetails();
    }
}



