package com.pluralsight;

import java.sql.*;

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
                    displayAllProducts(username, password);
                    break;
                case 2:
                    displayAllCustomers(username, password);
                    break;
                case 0:
                    System.out.println("Leaving Application...");
                    return;
                default:
                    System.out.println("Invalid Option, Please Enter a Valid Number");

            }
        }
    }

        private static void displayAllProducts(String username, String password) {

            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet results = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind", username, password);

                String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
                preparedStatement = connection.prepareStatement(query);
                results = preparedStatement.executeQuery();

                while (results.next()) {
                    int productId = results.getInt("ProductID");
                    String productName = results.getString("ProductName");
                    double unitPrice = results.getDouble("UnitPrice");
                    int unitsInStock = results.getInt("UnitsInStock");

                    System.out.println("Product ID: " + productId);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println("-----------------------------------------");
                }


        } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            } finally {
                if (results != null) {
                    try {
                        results.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    private static void displayAllCustomers(String username, String password) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                String contactName = results.getString("ContactName");
                String companyName = results.getString("CompanyName");
                String city = results.getString("City");
                String country = results.getString("Country");
                String phone = results.getString("Phone");

                System.out.println("Contact Name: " + contactName);
                System.out.println("Company Name: " + companyName);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println("Phone: " + phone);
                System.out.println("-----------------------------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


