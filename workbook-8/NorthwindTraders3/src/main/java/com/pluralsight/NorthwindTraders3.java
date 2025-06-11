package com.pluralsight;

import java.util.Scanner;

public class NorthwindTraders3 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Application needs a two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        Scanner scanner = new Scanner (System.in);
        String username = args[0];
        String password = args[1];

        while (true) {

            System.out.println("Select a Display Option");
            System.out.println("'1' - Display all Products");
            System.out.println("'2' - Display all Customers");
            System.out.println("'0' - Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:

            }
        }


        }
    }


