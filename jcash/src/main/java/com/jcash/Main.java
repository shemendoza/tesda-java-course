package com.jcash;

import com.jcash.model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("09123456789", "1234", "She Mendoza");

        user.deposit(20000);
        user.withdraw(5000);

        System.out.println("Name: " + user.getFullName());
        System.out.println("Mobile Number: " + user.getMobileNumber());
        System.out.println("Balance: " + user.getBalance());

        System.out.println("Transactions:");
        for(String transaction : user.getTransactions()){
            System.out.println(transaction);
        }
    }
}