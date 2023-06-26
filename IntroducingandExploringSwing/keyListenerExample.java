//WAP to copy the text of first textfield to second textfield on pressing of ENTER key on first textfield
package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class keyListenerExample extends JFrame implements KeyListener {

    JTextField txtFirst, txtSecond;

    public keyListenerExample()
    {
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txtFirst = new JTextField(20);
        txtSecond = new JTextField(20);
        add(txtFirst);
        add(txtSecond);
        
        txtFirst.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // row new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if(e.getKeyCode()==KeyEvent.VK_ENTER)
       {
           txtSecond.setText(txtFirst.getText());
           txtSecond.requestFocus();
           txtSecond.selectAll();
       }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        new keyListenerExample();
        
    }
   
    
}
