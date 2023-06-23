// WAP  to implement JToggleButton
 
package IntroducingandExploringSwing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DisplayImageToggle extends JFrame implements ActionListener{
    
    JLabel lblImage;
    JToggleButton toggle;
    public DisplayImageToggle(){
     setSize(700,500);
     setVisible(true);
     setLayout(new FlowLayout());
     
     lblImage = new JLabel();
     ImageIcon icon = new ImageIcon("C:\\Users\\Students.DESKTOP-E64T97K\\Documents\\NetBeansProjects\\SecA\\Image\\on.jpg");        
     lblImage.setIcon(icon);
     
     toggle = new JToggleButton("ON/OFF");
     
     add(lblImage);
     
     add(toggle);
     toggle.addActionListener(this);
    }
    
    public static void main(String[] args){
     new DisplayImageToggle();   
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
     if(toggle.isSelected())
     {
         ImageIcon icon = new ImageIcon("C:\\Users\\Students.DESKTOP-E64T97K\\Documents\\NetBeansProjects\\SecA\\Image\\off.jpg");
         lblImage.setIcon(icon);
     }
     else{
             ImageIcon icon = new ImageIcon("C:\\Users\\Students.DESKTOP-E64T97K\\Documents\\NetBeansProjects\\SecA\\Image\\on.jpg");
         lblImage.setIcon(icon);
             }
    }
} 
