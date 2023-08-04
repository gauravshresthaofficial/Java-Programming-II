<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store in Database</title>
    </head>
    <body>
        
        <%
            // Step 1: Load the MySQL JDBC driver class
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Define the connection parameters
            String url = "jdbc:mysql://localhost/test"; // Replace "test" with the actual database name
            String uid = "root"; // Replace with your MySQL username
            String pwd = ""; // Replace with your MySQL password

            // Step 3: Establish a connection to the database
            Connection con = DriverManager.getConnection(url, uid, pwd);

            // Step 4: Define an SQL query for insertion
            String sql = "Insert into tblStudent values(12,'Sujan')";

            // Step 5: Create a statement to execute the SQL query
            Statement state = con.createStatement();

            // Step 6: Execute the SQL query (Insert data into the table)
            state.executeUpdate(sql);

            // Uncomment the following sections to execute other SQL operations
            // Step 7: Close the resources (statement and connection)
            state.close();
            con.close();
        %>
    </body>
</html>
