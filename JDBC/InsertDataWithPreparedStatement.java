//Write a java program to insert record into database using prepared statement.
package JDBC;

import java.sql.*;
import java.util.*;

/**
 * This program demonstrates how to insert data into a database using PreparedStatement.
 * It takes user input for name and roll number, then inserts the data into the "tblStudent" table.
 *
 * @author Students
 */
public class InsertDataWithPreparedStatement {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.jdbc.Driver");
        
        // Database connection information
        String url = "jdbc:mysql://localhost/test"; // JDBC URL for the MySQL database
        String uid = "root"; // Database user ID
        String pwd = ""; // Database password (if any)
        
        Scanner scan = new Scanner(System.in);
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection(url, uid, pwd);

        // SQL query to insert data into the "tblStudent" table using placeholders (?)
        String sql = "insert into tblStudent values(?,?)";

        // Create a PreparedStatement to execute the SQL query with placeholders
        PreparedStatement state = con.prepareStatement(sql);

        // Prompt the user to enter name and roll number
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter roll number: ");
        int roll = scan.nextInt();

        // Set the values for the placeholders in the PreparedStatement
        state.setInt(1, roll);
        state.setString(2, name);

        // Execute the SQL query to insert data into the table
        state.executeUpdate();
        
        // Close the PreparedStatement and database connection
        state.close();
        con.close();
    }
}
