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

    public List<Actor> getActorByName(String actorLastName) {
        List<Actor> actors = new ArrayList<>();
        String actorInfo = "SELECT actorId, firstName, lastName FROM Actor";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(actorInfo);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                do {
                    int actorId = resultSet.getInt(1);
                    String firstName = resultSet.getString(2);
                    String lastName = resultSet.getString(3);


                    actors.add(new Actor(actorId, firstName, lastName));

                } while (resultSet.next());
            } else {
                System.out.println("No Matches");
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred!");
            ex.printStackTrace();
        }
        return actors;
    }

    /*public Film getFilmByActorId(int ActorId) {
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
    }*/


}