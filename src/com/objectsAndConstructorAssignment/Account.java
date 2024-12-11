package com.objectsAndConstructorAssignment;

// Account class to maintain customer account details
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    // Getter and Setter methods for account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

// Bank class to manage a collection of accounts
class Bank {
    private Account[] accounts;
    private int accountCount;

    // Constructor to initialize bank with a fixed size
    public Bank(int capacity) {
        accounts = new Account[capacity];
        accountCount = 0;
    }

    // Method to add an account
    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
            System.out.println("Account added for: " + account.getAccountHolderName());
        } else {
            System.out.println("Bank is at full capacity. Cannot add more accounts.");
        }
    }

    // Method to remove an account by account number
    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                // Shift the remaining accounts
                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[accountCount - 1] = null;  // Nullify the last slot
                accountCount--;
                System.out.println("Account with number " + accountNumber + " removed.");
                return;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
    }

    // Method to find an account by account number
    public Account findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
}

// Main class to test the Bank and Account functionality
 class AccountMain {
    public static void main(String[] args) {
        // Create a bank with a capacity of 3 accounts
        Bank bank = new Bank(3);

        // Create some Account objects
        Account account1 = new Account("A123", "Alice", 1000);
        Account account2 = new Account("B456", "Bob", 5000);
        Account account3 = new Account("C789", "Charlie", 2000);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Deposit and withdraw money
        account1.deposit(500);
        account2.withdraw(1500);

        // Find an account and perform operations
        Account foundAccount = bank.findAccount("B456");
        if (foundAccount != null) {
            foundAccount.deposit(1000);
            foundAccount.withdraw(2000);
        } else {
            System.out.println("Account not found.");
        }

        // Remove an account
        bank.removeAccount("A123");

        // Try to find the removed account
        foundAccount = bank.findAccount("A123");
        if (foundAccount == null) {
            System.out.println("Account A123 does not exist.");
        }
    }
}
