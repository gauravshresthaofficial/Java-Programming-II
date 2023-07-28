//Write a servlet program to calculate the SI where parameter should be passed from the “html form”
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interest extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        
        double p = Double.parseDouble(req.getParameter("txtP"));
        double t = Double.parseDouble(req.getParameter("txtT"));
        double r = Double.parseDouble(req.getParameter("txtR"));
        
        double i = (p * t * r) / 100;
        
        out.print("Interest is " + i);
        
        // Establish a database connection and insert data into the "interest" table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/test"; // Replace "test" with your actual database name
            String uid = "root"; // Database user ID
            String pwd = ""; // Database password (if any)
            
            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, uid, pwd);

            // SQL query to insert data into the "interest" table using placeholders (?)
            String sql = "INSERT INTO interest (principal, time, rate, interest) VALUES (?, ?, ?, ?)";

            // Create a PreparedStatement to execute the SQL query with placeholders
            PreparedStatement state = con.prepareStatement(sql);

            // Set the values for the placeholders in the PreparedStatement
            state.setDouble(1, p);
            state.setDouble(2, t);
            state.setDouble(3, r);
            state.setDouble(4, i);

            // Execute the SQL query to insert data into the table
            state.executeUpdate();

            // Close the PreparedStatement and database connection
            state.close();
            con.close();
            
            res.sendRedirect("interest.html");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new ServletException("Database error", e);
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // Handle GET requests if needed (optional)
        // For simplicity, we'll just call the doPost method for GET requests too
        doPost(req, res);
    }
}
