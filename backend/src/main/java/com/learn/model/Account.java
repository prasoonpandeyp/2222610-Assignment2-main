package com.learn.model;

import java.time.LocalDate;
import java.util.List;

/*
 * Create an abstract class Account with the following fields:
 * accountNumber as integer
 * balance as double
 * openingDate as java LocalDate object
 * list of transactions as List of Transaction objects
 * 
 * Create below methods in the Account class:
 * deposit method to add credit transaction to the list of transactions for each deposit
 * getAccountDetails method which returns a string with account details
 */
public abstract class Account {
    private int accountNumber;
    private double balance;
    private LocalDate openingDate;
    private List<Transaction> transactions;

    // constructor with one argument accountNumber balance openingDate and create a list of transactions
    public Account(int accountNumber, double balance, LocalDate openingDate, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;
        this.transactions = transactions;
    }

    // create a getters and setters for accountNumber, balance, openingDate, transactions
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }
//crete deposit method to add credit transaction to the list of transactions for each deposit

    public void deposit(double amount) {
        Transaction transaction = new Transaction.Builder()
                .date(LocalDate.now())
                .type(Transaction.Type.CREDIT)
                .amount(amount)
                .build();
        transactions.add(transaction);
        balance += amount;
    }
    //crete getAccountDetails method which returns a string with account details
    public List<Transaction> getTransactions() {
        return transactions;
    }
//crete getAccountDetails method which returns a string with account details
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //crete getAccountDetails method which returns a string with account details

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //crete getAccountDetails method which returns a string with account details

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }
    //crete getAccountDetails method which returns a string with account details

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    // tostring method to return account details
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", openingDate=" + openingDate
                + ", transactions=" + transactions + "]";
    }   
}
