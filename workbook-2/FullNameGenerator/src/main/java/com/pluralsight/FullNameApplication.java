package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner namescanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = namescanner.nextLine();

        System.out.println("Middle Name: ");
        String middleName = namescanner.nextLine();

        System.out.println("Last Name: ");
        String lastName = namescanner.nextLine();

        System.out.println("Last Name: ");
        String suffixEntry = namescanner.nextLine();

        System.out.println(firstName + " " + middleName + " " + lastName + suffixEntry);
    }
}
