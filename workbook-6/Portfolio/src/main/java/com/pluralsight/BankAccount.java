package com.pluralsight;

public class BankAccount implements IValuable{

 private String name;
 private String accountNumber;
 private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
