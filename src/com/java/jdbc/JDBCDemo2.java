package com.java.jdbc;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO employee (empid, empFname, empLname, country) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Example data to insert
            int[] empId = {30, 28, 35};
            String[] names = {"Alice", "Bob", "Charlie"};
            String[] lnames = {"Alice", "Bob", "Charlie"};
            String[] countries = {"India", "Nepal", "Bhutan"};

            // Inserting multiple rows using PreparedStatement
            for (int i = 0; i < names.length; i++) {
                preparedStatement.setInt(1, empId[i]);
                preparedStatement.setString(2, names[i]);
                preparedStatement.setString(3, lnames[i]);
                preparedStatement.setString(4, countries[i]);
                preparedStatement.executeUpdate();
            }

            System.out.println("Data inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
