package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhoneApplication phone = new CellPhoneApplication();

        //The following are set here phone.set#####(scanner.next###())
        System.out.println("Enter Your Serial Number: ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Your Phone Model: ");
        phone.setPhoneModel(scanner.nextLine());

        System.out.println("Enter Your Phone Carrier: ");
        phone.setPhoneCarrier(scanner.nextLine());

        System.out.println("Enter Your Phone Number: ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter Your Name: ");
        phone.setPhoneOwner(scanner.nextLine());

        StringBuilder phoneInfo = new StringBuilder();
        phoneInfo.append("\nPhone Info:\n");

        phoneInfo.append("Serial Number: ").append(phone.getSerialNumber()).append("\n");
        phoneInfo.append("Model: ").append(phone.getPhoneModel()).append("\n");
        phoneInfo.append("Carrier: ").append(phone.getPhoneCarrier()).append("\n");
        phoneInfo.append("Phone Number: ").append(phone.getPhoneNumber()).append("\n");
        phoneInfo.append("Phone Owner: ").append(phone.getPhoneOwner()).append("\n");

        System.out.println(phoneInfo.toString());

        scanner.close();
    }
}
