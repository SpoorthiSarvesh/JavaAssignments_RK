//
//9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
//Create two subclasses SavingsAccount and CheckingAccount.
//Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
package com.polymorphism;

// Base class BankAccount
abstract class BankAccount9 {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount9(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Abstract method for withdrawing money
    public abstract void withdraw(double amount);

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount9 extending BankAccount9
class SavingsAccount9 extends BankAccount9 {
    private static final double WITHDRAWAL_LIMIT = 1000.0;  // Maximum withdrawal limit for savings account
    private static final double WITHDRAWAL_FEE = 10.0;  // Withdrawal fee for savings account

    // Constructor to initialize balance for SavingsAccount9
    public SavingsAccount9(double balance) {
        super(balance);
    }

    // Overriding the withdraw method for SavingsAccount9
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            if (amount <= WITHDRAWAL_LIMIT) {
                double totalAmount = amount + WITHDRAWAL_FEE;
                if (getBalance() >= totalAmount) {
                    // Deduct the withdrawal amount and fee
                    double newBalance = getBalance() - totalAmount;
                    System.out.println("Withdrew: " + amount + " with a fee of " + WITHDRAWAL_FEE);
                    System.out.println("New balance: " + newBalance);
                } else {
                    System.out.println("Insufficient balance to cover withdrawal and fee.");
                }
            } else {
                System.out.println("Withdrawal limit exceeded. Maximum allowed: " + WITHDRAWAL_LIMIT);
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Subclass CheckingAccount9 extending BankAccount9
class CheckingAccount9 extends BankAccount9 {
    private static final double WITHDRAWAL_LIMIT = 5000.0;  // Maximum withdrawal limit for checking account
    private static final double WITHDRAWAL_FEE = 5.0;  // Withdrawal fee for checking account

    // Constructor to initialize balance for CheckingAccount9
    public CheckingAccount9(double balance) {
        super(balance);
    }

    // Overriding the withdraw method for CheckingAccount9
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            if (amount <= WITHDRAWAL_LIMIT) {
                double totalAmount = amount + WITHDRAWAL_FEE;
                if (getBalance() >= totalAmount) {
                    // Deduct the withdrawal amount and fee
                    double newBalance = getBalance() - totalAmount;
                    System.out.println("Withdrew: " + amount + " with a fee of " + WITHDRAWAL_FEE);
                    System.out.println("New balance: " + newBalance);
                } else {
                    System.out.println("Insufficient balance to cover withdrawal and fee.");
                }
            } else {
                System.out.println("Withdrawal limit exceeded. Maximum allowed: " + WITHDRAWAL_LIMIT);
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating objects of SavingsAccount9 and CheckingAccount9
        BankAccount9 savingsAccount = new SavingsAccount9(2000.0);  // Savings account with balance 2000
        BankAccount9 checkingAccount = new CheckingAccount9(5000.0); // Checking account with balance 5000

        // Depositing money into both accounts
        savingsAccount.deposit(500.0);    // Deposit 500 into savings account
        checkingAccount.deposit(1000.0);  // Deposit 1000 into checking account

        // Withdrawing money from both accounts
        System.out.println("\nSavings Account Withdrawal:");
        savingsAccount.withdraw(800.0);  // Try withdrawing 800 from savings account (with fee)

        System.out.println("\nChecking Account Withdrawal:");
        checkingAccount.withdraw(3000.0); // Try withdrawing 3000 from checking account (with fee)
    }
}
