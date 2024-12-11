//5. Write a Java program to create a class known as "BankAccount"
//with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method
//to prevent withdrawals if the account balance falls below one hundred.
package com.inheritance2.package2;


class BankAccount {
    double balance;


    BankAccount(double initialBalance) {
        balance = initialBalance;
    }


    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

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


class SavingsAccount extends BankAccount {


    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }


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

        SavingsAccount myAccount = new SavingsAccount(500);


        myAccount.deposit(200);

        myAccount.withdraw(500);

        myAccount.withdraw(200);
    }
}

