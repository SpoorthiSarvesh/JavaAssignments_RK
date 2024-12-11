//
//9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
//Create two subclasses SavingsAccount and CheckingAccount.
//Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
package com.polymorphism2.package2;


abstract class BankAccount9 {
    private double balance;


    public BankAccount9(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount9 extends BankAccount9 {
    private static final double WITHDRAWAL_LIMIT = 1000.0;
    private static final double WITHDRAWAL_FEE = 10.0;


    public SavingsAccount9(double balance) {
        super(balance);
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            if (amount <= WITHDRAWAL_LIMIT) {
                double totalAmount = amount + WITHDRAWAL_FEE;
                if (getBalance() >= totalAmount) {

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


class CheckingAccount9 extends BankAccount9 {
    private static final double WITHDRAWAL_LIMIT = 5000.0;
    private static final double WITHDRAWAL_FEE = 5.0;


    public CheckingAccount9(double balance) {
        super(balance);
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            if (amount <= WITHDRAWAL_LIMIT) {
                double totalAmount = amount + WITHDRAWAL_FEE;
                if (getBalance() >= totalAmount) {

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

        BankAccount9 savingsAccount = new SavingsAccount9(2000.0);
        BankAccount9 checkingAccount = new CheckingAccount9(5000.0);


        savingsAccount.deposit(500.0);
        checkingAccount.deposit(1000.0);


        System.out.println("\nSavings Account Withdrawal:");
        savingsAccount.withdraw(800.0);

        System.out.println("\nChecking Account Withdrawal:");
        checkingAccount.withdraw(3000.0);
    }
}
