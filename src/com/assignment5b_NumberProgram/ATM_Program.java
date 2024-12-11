//ATM program Java
package com.assignment5b_NumberProgram;
import java.util.Scanner;
public class ATM_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;  // Initial balance
        String pin = "1234";  // ATM PIN
        String enteredPin;

        // Welcome message
        System.out.println("Welcome to the ATM!");

        // Ask for the PIN
        System.out.print("Please enter your PIN: ");
        enteredPin = scanner.nextLine();

        // Validate the PIN
        if (!enteredPin.equals(pin)) {
            System.out.println("Incorrect PIN. Exiting...");
            return;  // Exit if the PIN is incorrect
        }

        // Display the ATM menu
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Please enter a valid amount to withdraw.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Your balance is: $" + balance);
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn: $" + withdrawAmount);
                        System.out.println("Your current balance is: $" + balance);
                    }
                    break;
                case 3: // Deposit Money
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Please enter a valid amount to deposit.");
                    } else {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited: $" + depositAmount);
                        System.out.println("Your current balance is: $" + balance);
                    }
                    break;
                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    isRunning = false; // Exit the loop and terminate the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


        scanner.close();
    }
}
