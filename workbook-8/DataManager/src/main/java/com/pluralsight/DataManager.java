package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataManager {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("The Application requires a username and password!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        String productQuery = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(productQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                System.out.println("Products:");

                do {
                    int productId = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    double unitPrice = resultSet.getDouble(3);
                    int unitsInStock = resultSet.getInt(4);

                    System.out.println("Product ID: " + productId);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println(" ================================ ");

                } while (resultSet.next());
            } else {
                System.out.println("No matches found...");
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred");
            ex.printStackTrace();
        }
    }
}
