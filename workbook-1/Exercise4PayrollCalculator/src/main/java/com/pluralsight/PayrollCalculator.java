package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
        public static void main(String[] args) {
            /*...*/

            Scanner customScanner = new Scanner(System.in);

            System.out.println("Please enter your name here: ");
            String userName = customScanner.nextLine();

            System.out.println("Enter your hours worked: ");
            float hoursWorked = customScanner.nextFloat();
            customScanner.nextLine();

            System.out.println("Enter your hourly rate: ");
            float hourlyRate = customScanner.nextFloat();
            customScanner.nextLine();

            System.out.println();
            System.out.println("================");
            System.out.println();

            float grossPay = (hoursWorked * hourlyRate);

            System.out.printf("%s your total gross pay is %.2f", userName, grossPay);


        }
    }

