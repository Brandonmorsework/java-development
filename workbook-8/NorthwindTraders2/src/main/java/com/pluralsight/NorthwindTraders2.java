package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders2 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;


        try {
            if (args.length != 2) {
                System.out.println(
                        "Application needs two arguments to run: " + "java com.hca.jdbc.UsingDriverManager <username> " +
                                "<password>");
                System.exit(1);
            }


            String username = args[0];
            String password = args[1];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter the last name of the customers you want to see: ");
            String lastNameToSee = scanner.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    username,
                    password);


            String query = """
            SELECT first_name, last_name
            FROM customer
            WHERE last_name LIKE ?
            ORDER BY first_name
            """;


            PreparedStatement statement = connection.prepareStatement(query);


            results = statement.executeQuery();


            while (results.next()) {
                String firstName = results.getString("first_name");
                String lastName = results.getString("last_name");

                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
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
}
