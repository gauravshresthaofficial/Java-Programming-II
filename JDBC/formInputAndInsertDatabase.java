//Write a java program to take input from form and insert into database.
package JDBC;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class formInputAndInsertDatabase extends JFrame implements ActionListener {

    Label name;
    Label roll;

    TextField txtname;
    TextField txtroll;

    JButton btn;

    public formInputAndInsertDatabase() {
        setSize(700, 500);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        name = new Label("Name:");
        roll = new Label("Roll no:");

        txtname = new TextField(20);
        txtroll = new TextField(10);

        btn = new JButton("Insert");

        add(name);
        add(txtname);
        add(roll);
        add(txtroll);
        add(btn);
        btn.addActionListener(this);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new formInputAndInsertDatabase();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Step 1: Load the MySQL JDBC driver class
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Define the connection parameters
            String url = "jdbc:mysql://localhost/test"; // Replace "test" with the actual database name
            String uid = "root"; // Replace with your MySQL username
            String pwd = ""; // Replace with your MySQL password

            // Step 3: Establish a connection to the database
            Connection con = DriverManager.getConnection(url, uid, pwd);
            String n = txtname.getText();
            String r = txtroll.getText();

            if ("".equals(n) || "".equals(r)) {
                JOptionPane.showMessageDialog(null, "Please Enter Roll Or Name","Validation",JOptionPane.INFORMATION_MESSAGE);
                txtname.requestFocus();
                return;
            }

            // Step 4: Define an SQL query for insertion
            String sql = "Insert into tblStudent values(" + "'" + n + "'," + r + ")";

            // Step 5: Create a statement to execute the SQL query
            Statement state = con.createStatement();

            // Step 6: Execute the SQL query (Insert data into the table)
            state.executeUpdate(sql);

            // Uncomment the following sections to execute other SQL operations
            // Step 7: Close the resources (statement and connection)
            state.close();
            con.close();
            // Clear the text fields after successful insertion
            txtname.setText("");
            txtroll.setText("");
            txtname.requestFocus();
            txtname.selectAll();
            JOptionPane.showMessageDialog(null, "Data Saved Successfully");
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formInputAndInsertDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formInputAndInsertDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
