//WAP  to change the font size of button text on TextField focus and lost
package seca;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusListenerExample extends JFrame implements FocusListener {

    JTextField txtFirst, txtSecond;
    JButton button;

    public FocusListenerExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        txtFirst = new JTextField(20);
        txtSecond = new JTextField(20);
        button = new JButton("A Button");
        add(txtFirst);
        add(txtSecond);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        txtFirst.addFocusListener(this);
    }
    public static void main(String[] args) {
        new FocusListenerExample();
    }

    @Override
    public void focusGained(FocusEvent e) {
        button.setFont(new Font ("Arial", Font.ITALIC,25));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
         button.setFont(new Font ("Arial", Font.BOLD,25));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
