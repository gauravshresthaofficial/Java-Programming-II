//WAP to implements the mouseEntered and mouseExited

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseExample extends JFrame implements MouseListener {

    JPanel p;

    public MouseExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(null);
        Button btnShow = new Button("Show");
        btnShow.setBounds(20,20,100,50);
        
        p = new JPanel();
        p.setBounds(20,100,400,400);
        p.setBackground(Color.red);
        add(btnShow);
        add(p);
        
        btnShow.addMouseListener(this);
    }
    
    public static void main(String[] args) {
        new MouseExample();
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        p.setBackground(Color.blue);
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        p.setBackground(Color.red);
    }
    
}
