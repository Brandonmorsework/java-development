package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner namescanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = namescanner.nextLine();

        if (firstName.trim().isEmpty()) {
            System.out.println("First Name is Required");
            return;
        }
        System.out.println("Middle Name: ");
        String middleName = namescanner.nextLine();

        if (middleName.trim().isEmpty()) {
            middleName = ("");
        } else  {
            middleName = (" " + middleName.trim());

        }

        System.out.println("Last Name: ");
        String lastName = namescanner.nextLine();

        if (lastName.trim().isEmpty()) {
            System.out.println("Last Name is Required");
            return;
        }

        System.out.println("Enter Suffix (If you have one): ");
        String suffixEntry = namescanner.nextLine();

        if (suffixEntry.trim().isEmpty()) {
            suffixEntry = ("");
        } else  {
            suffixEntry = (", " + suffixEntry);

        }

        System.out.println(firstName.trim() + middleName + " " + lastName.trim() + suffixEntry.trim());
    }
}
