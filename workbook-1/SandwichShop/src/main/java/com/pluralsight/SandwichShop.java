package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner sandwichScanner = new Scanner(System.in);

        System.out.println("If you want a Regular Sandwich, Type 1: ");
        System.out.println("If you want a Large Sandwich, Type 2: ");

        int sandwichType = sandwichScanner.nextInt();
        double originalPrice;
        if (sandwichType == 1) {
            originalPrice = 5.45;
        } else if (sandwichType == 2) {
            originalPrice = 8.95;
            } else {
            System.out.println("Error, Cannot Calculate This Sandwich Size... ");
            return;
        }

        System.out.println("How old are you? :" );
       int age = sandwichScanner.nextInt();
       double discount;
        if (age <= 17) {
            discount = 0.9;
        } else if (age >= 65) {
            discount = 0.8;
        } else {
            discount = 1;
            System.out.println("No discount");
        }

        double finalSandwichPrice;
        finalSandwichPrice = originalPrice * discount;
        System.out.printf("Your Total is: $%.2f%n" , finalSandwichPrice);
        }
    }

