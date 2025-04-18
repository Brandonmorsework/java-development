package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please Provide the Following Information");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.println("");
        System.out.println("=========");
        System.out.println("");

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder userInfo = new StringBuilder();

        userInfo.append(fullName);
        userInfo.append("\n\n");
        userInfo.append("Billing Address: ");
        userInfo.append("\n\n");
        userInfo.append(billingStreet);
        userInfo.append("\n\n");
        userInfo.append(billingState).append(", ").append(billingCity).append(" ").append(billingZip);
        userInfo.append("\n\n");
        userInfo.append("Shipping Address: ");
        userInfo.append("\n\n");
        userInfo.append(shippingStreet);
        userInfo.append(shippingCity);
        userInfo.append(shippingState);


        String userInfoString = userInfo.toString();
        System.out.println(userInfoString);



    }
}
