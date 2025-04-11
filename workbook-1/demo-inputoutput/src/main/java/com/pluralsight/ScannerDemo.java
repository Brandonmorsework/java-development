package com.pluralsight;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*...*/

        Scanner tomatoScanner = new Scanner(System.in);

        System.out.println("Please Provide Your Name: ");
        String name = tomatoScanner.nextLine();

        System.out.println("Hello Everyone I am " + name + "and I love tomatoes!");
    }
}
