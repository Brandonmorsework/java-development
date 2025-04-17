package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please Enter Your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("What date will you be coming? (MM/dd/yyyy) ");
        String dateInputFromUser = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate fixedDate = LocalDate.parse(dateInputFromUser, formatter);

        System.out.println("How many tickets would you like? ");
        int ticketNumber = scanner.nextInt();

        if (ticketNumber > 1) {
            System.out.println(ticketNumber + " tickets reserved for " + fixedDate + " under " + lastName + ", " + firstName);
        }  else {
            System.out.println(ticketNumber + " ticket reserved for " + fixedDate + " under " + lastName + ", " + firstName);
        }

    }
}
