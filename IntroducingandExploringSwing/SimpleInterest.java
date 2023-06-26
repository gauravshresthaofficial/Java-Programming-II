//WAP to calculate the Simple Interest using keyListener


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleInterest extends JFrame implements KeyListener{
    JTextField txtFirst, txtSecond, txtThird, txtFourth;
    double p, t , r;
    public SimpleInterest()
    {
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txtFirst = new JTextField(20);
        txtSecond = new JTextField(20);
        txtThird = new JTextField(20);
        txtFourth = new JTextField(20);
        add(txtFirst);
        add(txtSecond);
        add(txtThird);
        add(txtFourth);
        
        txtFirst.addKeyListener(this);
        txtSecond.addKeyListener(this);
        txtThird.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // row new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if(e.getKeyCode()==KeyEvent.VK_ENTER &&e.getSource().equals(txtFirst))
       {
           txtSecond.requestFocus();

       }
       if(e.getKeyCode()==KeyEvent.VK_ENTER &&e.getSource().equals(txtSecond))
       {
           txtThird.requestFocus();

       }
       
       if(e.getKeyCode()==KeyEvent.VK_ENTER &&e.getSource().equals(txtThird))
       {
          p = Double.parseDouble(txtFirst.getText());
          t = Double.parseDouble(txtSecond.getText());
          r = Double.parseDouble(txtThird.getText());
          
          double re = (p*t*r/100);
          txtFourth.setText(re+"");
           



       }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        new SimpleInterest();
        
    }
   
}
