package com.bank_account;
/*
Task 1: Bank account

We create a class Bank account that contains basic bank account functions: depositing, withdrawing and displaying the account balance.

We need the following properties (variables):
-Account owner (accountOwner) is already specified
-Account balance (balance) is already specified

We need the following functions (methods):
-Deposit (deposit) is already specified
-Withdraw (withdraw)
-Show account balance (showBalance) TODO
 */
public class BankAccount {
    //Attributes as Variables
    String accountOwner;
    double balance;
    double amount;

    void showAttributes() {
        System.out.println("Account Owner: " + accountOwner );
        System.out.println("Account Balance: " + balance );
        System.out.println("*****");
    }

    void deposit(double balance) {
        this.balance += amount;
    }
    void withdraw(double balance){
        this.balance -= amount;
    }
}
