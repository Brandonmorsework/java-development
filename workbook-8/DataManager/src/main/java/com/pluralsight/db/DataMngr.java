package com.pluralsight.db;

import com.pluralsight.program.Product;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataMngr {

    public List<Product> getAllProducts(BasicDataSource dataSource) {

        List<Product> products = new ArrayList<>();
        String productQuery = "SELECT ProductId, ProductName, UnitPrice, UnitsInStock FROM Products";

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

                    products.add(new Product(productId, productName, unitPrice, unitsInStock));

                } while (resultSet.next());
            } else {
                System.out.println("No matches found...");
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred");
            ex.printStackTrace();
        }
        return products;
    }

}
