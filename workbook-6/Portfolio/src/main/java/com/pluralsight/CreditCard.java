package com.pluralsight;

public class CreditCard implements IValuable{

    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }

}
