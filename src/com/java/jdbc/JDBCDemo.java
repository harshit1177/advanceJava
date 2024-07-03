package com.java.jdbc;

//Java program to implement a simple JDBC application


import java.sql.*;

public class JDBCDemo {

    public static void main(String args[])
            throws SQLException, ClassNotFoundException
    {

        //Load the driver class
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company","root","");

     //   String query = "insert into employee values(110, 'dummy','abc','India')";

          String query = "select * from employee";

        // Obtain a statement
        Statement st = con.createStatement();

        // Execute the query
      //  int count = st.executeUpdate(query);

        ResultSet resultSet = st.executeQuery(query);


        while (resultSet.next()) {
            // Process each row
            int id = resultSet.getInt("empid");
            String firstName = resultSet.getString("empFname");
            String lastName = resultSet.getString("empLname");
            String country = resultSet.getString("country");
            System.out.println(id+" "+firstName+" "+lastName+" "+country);
            // Process retrieved data
        }

//        System.out.println(
//                "number of rows affected by this query= "
//                        + count);

        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
} // class
