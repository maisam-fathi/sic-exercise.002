package com.bank_account;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter the account owner's name: ");
        account.accountOwner = scanner.nextLine();

        System.out.print("Determine the initial account balance: ");
        account.balance =scanner.nextDouble();
        account.showAttributes();

        while (true){
            System.out.print("Enter number 1 to withdraw from the account and number 2 to deposit into the account (0 to exit): ");
            int p = scanner.nextInt();
            if (p == 1) {
                System.out.print("How much do you want to withdraw from your account? ");
                account.amount = scanner.nextDouble();

                if (account.balance > 0 && account.amount < account.balance){
                    account.withdraw(account.balance);
                    account.showAttributes();
                } else {
                    System.out.println("There is not enough money in your account.");
                    account.showAttributes();
                }
            }
            if (p == 2){
                System.out.print("How much money do you want to deposit into your account? ");
                account.amount = scanner.nextDouble();
                account.deposit(account.balance);
                account.showAttributes();
            }
            if (p==0){
                return;
            }
        }
    }
}
