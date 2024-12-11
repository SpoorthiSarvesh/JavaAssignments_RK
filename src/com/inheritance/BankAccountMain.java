//5. Write a Java program to create a class known as "BankAccount"
//with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method
//to prevent withdrawals if the account balance falls below one hundred.
package com.inheritance;

// Parent class
class BankAccount {
    double balance;

    // Constructor to initialize the balance
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds to withdraw: " + amount);
        }
    }
}

// Subclass SavingsAccount that overrides withdraw method
class SavingsAccount extends BankAccount {

    // Constructor to initialize the balance in SavingsAccount
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overriding the withdraw method to prevent withdrawals if balance falls below 100
    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw. The account balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating an object of SavingsAccount with initial balance of 500
        SavingsAccount myAccount = new SavingsAccount(500);

        // Depositing money
        myAccount.deposit(200);

        // Trying to withdraw an amount that keeps balance above 100
        myAccount.withdraw(500);

        // Trying to withdraw an amount that would make the balance go below 100
        myAccount.withdraw(200);
    }
}

