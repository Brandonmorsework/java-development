package com.pluralsight;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection sqlConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "P@ssw0rd"
        );

        Statement statement = sqlConnection.createStatement();

        String query = "SELECT District " +
                "FROM city";

        ResultSet results = statement.executeQuery(query);

        while (results.next()) {

            String name = results.getString("District");
            System.out.println(name);
        }

        sqlConnection.close();





    }

}
