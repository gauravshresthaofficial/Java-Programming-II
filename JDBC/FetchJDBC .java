//Write a java program to fetch data from a database.

package JDBC;

import java.sql.*;

public class FetchJDBC {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.jdbc.Driver");
        
        // Database connection information
        String url = "jdbc:mysql://localhost/test"; // JDBC URL for the MySQL database
        String uid = "root"; // Database user ID
        String pwd = ""; // Database password (if any)

        // Establish a connection to the database
        Connection con = DriverManager.getConnection(url, uid, pwd);

        // SQL query to retrieve data from the "tblStudent" table
        String sql = "select * from tblStudent";

        // Create a statement to execute the SQL query
        Statement state = con.createStatement();

        // Execute the SQL query and obtain the result set
        ResultSet rs = state.executeQuery(sql);

        // Display the fetched data
        System.out.println("Roll\tName\n");
        while(rs.next()) {
            // Access data from the result set by column index and print it
            System.out.print(rs.getInt(1) + "\t"); // Assuming the first column is of type INT
            System.out.println(rs.getString(2)); // Assuming the second column is of type VARCHAR
        }

        // Close the resources
        rs.close();
        state.close();
        con.close();
    }
}

