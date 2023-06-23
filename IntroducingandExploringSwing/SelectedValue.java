/*WAP to display a selected value of JComboBox in a TextField.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroducingandExploringSwing;

/**
 *
 * @author Students
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectedValue extends JFrame implements ItemListener {

    JComboBox cmbCountry = new JComboBox();
    JTextField txtDisplay;

     SelectedValue() {
        setTitle("DisplaySelectedValue Example");
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        

        cmbCountry.addItem("Select Country");
        cmbCountry.addItem("Nepal");
        cmbCountry.addItem("India");
        cmbCountry.addItem("China");
        
        txtDisplay = new JTextField(50);
        add(cmbCountry);
        add(txtDisplay);
        
        cmbCountry.addItemListener(this);
    }
    
    public static void main(String[] args) {
       new SelectedValue();
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
      if(cmbCountry.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Select a Country");
            return;
        }
        
        txtDisplay.setText(cmbCountry.getSelectedItem().toString());
           
    }
}
