//13. Write a Java program to create a class called "Inventory"
//with a collection of products and
//methods to add and remove products, and to check for low inventory.
package com.objectsAndConstructorAssignment.set2;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<String, Integer> products = new HashMap<>();

    // Add a product
    public void addProduct(String productName, int quantity) {
        products.put(productName, products.getOrDefault(productName, 0) + quantity);
        System.out.println(productName + " added with quantity: " + quantity);
    }

    // Remove a product
    public void removeProduct(String productName) {
        if (products.containsKey(productName)) {
            products.remove(productName);
            System.out.println(productName + " removed from inventory.");
        } else {
            System.out.println(productName + " not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        System.out.println("\nInventory:");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        inventory.addProduct("Apple", 10);
        inventory.addProduct("Banana", 5);

        // Remove a product
        inventory.removeProduct("Banana");

        // Display inventory
        inventory.displayInventory();
    }
}

