package com.pluralsight;

/*public class MainInputOutput {
    public static void main(String[] args) {
        System.out.println("Hello ");
        System.out.println("World");

        System.out.println("===================");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);

        // rounding and changing the amount of numbers after the decimal
        System.out.println("Total due is " + String.format("%.2f", totalDue));

        // second method of rounding and changing the amount of numbers after the decimal
        System.out.printf("Total due is: %.2f", totalDue);

        System.out.println();
        System.out.println("==================");
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;

        System.out.printf("%s (id: %d) $%.2f", name, id, pay);*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*...*/

        Scanner tomatoScanner = new Scanner(System.in);

        System.out.println("Please Provide Your Name: ");
        String name = tomatoScanner.nextLine();

        System.out.println("Hello Everyone I am " + name + "and I love tomatoes!");


    }
}
