package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {

    private static Vehicle[] vehicles = new Vehicle[20];

    private static int numOfVehicles = 6;

    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500f);

        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);

        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);

        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);

        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);

        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;

                case 2:
                    findVehicleByMakeModel(scanner);
                    break;
                case 3:
                    findVehicleByPrice(scanner);
                    break;
                case 4:
                    findVehicleByColor(scanner);
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid command.");

            }

        }

    }

    private static void listAllVehicles() {
        System.out.println("Vehicle Inventory");

        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println(vehicles[i]);
        }
    }

        public static void findVehicleByMakeModel(Scanner scanner){
            System.out.println("Enter make model: ");
            String makeModel = scanner.nextLine();

            boolean found = false;

            for (int i = 0; i < numOfVehicles; i++) {
                if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                    System.out.println(vehicles[i]);
                    found = true;
                }


            }
            if (!found) {
                System.out.println("No Vehicles Found...");
            }
        }

        public static void findVehicleByPrice(Scanner scanner) {
            System.out.println("Enter minimum price: ");
            float minPrice = scanner.nextFloat();

            System.out.println("Enter maximum price: ");
            float maxPrice = scanner.nextFloat();

            boolean found = false;

            for (int i = 0; 1 < numOfVehicles; i++) {
                if (vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {
                    System.out.println(vehicles[i]);
                    found = true;
                }

                }
            }
    public static void findVehicleByColor(Scanner scanner){
        System.out.println("Enter Color: ");
        String color = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicles[i]);
                found = true;
            }


        }
        if (!found) {
            System.out.println("No Vehicles Found...");
        }
    }

        }





