package com.pluralsight.db;

import com.pluralsight.model.Film;
import com.pluralsight.model.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Film> getAllProducts() {
        List<Film> films = new ArrayList<>();
        String filmsQuery = "SELECT filmId, title, description, releaseYear, length FROM Film";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(filmsQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                do {
                    int productId = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    double unitPrice = resultSet.getDouble(3);
                    int unitsInStock = resultSet.getInt(4);

                    films.add(new Film(productId, productName, unitPrice, unitsInStock));
                } while (resultSet.next());
            } else {
                System.out.println("No Matches");
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred!");
            ex.printStackTrace();
        }
        return films;
    }

    public Film getFilmByActorId(int ActorId) {
        Actor actorId = null;
        String productByIdQuery = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products WHERE ProductID = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(productByIdQuery)) {
            preparedStatement.setInt(1, actorId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int productIdFromDb = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    double unitPrice = resultSet.getDouble(3);
                    int unitsInStock = resultSet.getInt(4);

                    actorId = new Film(productIdFromDb, productName, unitPrice, unitsInStock);

                } else {
                    System.out.println("Product not found!");
                }
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred!");
            ex.printStackTrace();
        }
        return films;
    }


}