package com.jcash.model;

import java.util.*;

public class User {
    private String mobileNumber;
    private String pinNumber;
    private String fullName;
    private double balance;
    private List<String> transactions;

    public User (
     String mobileNumber,
     String pinNumber,
     String fullName){
        this.mobileNumber = mobileNumber;
        this.pinNumber = pinNumber;
        this.fullName = fullName;
        this.balance = 0.0;
        this.transactions = new ArrayList<String>();
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void setPinNumber(String pinNumber){
        this.pinNumber = pinNumber;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add("Deposit: " + amount);
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add("Withdrawal: " + amount);
        }

    }

    public void setTransactions(String transactions) {
        this.transactions.add(transactions);
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public String getPinNumber(){
        return pinNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}
