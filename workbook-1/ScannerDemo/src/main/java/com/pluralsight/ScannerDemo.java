package com.pluralsight;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*...*/

        Scanner customScanner = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int number1 = customScanner.nextInt();

        System.out.println("Enter the Second Number: ");
        int number2 = customScanner.nextInt();
        customScanner.nextLine();

        System.out.println("Which operation you would like to do next?");
        String response = customScanner.nextLine();

        System.out.println("The first number is: " + number1 + " and the second number is: " + number2);

        System.out.println("The operation is: " + response);

        }
}

