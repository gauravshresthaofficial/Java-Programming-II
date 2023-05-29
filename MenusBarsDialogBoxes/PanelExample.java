/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenusBarsDialogBoxes;

import java.awt.*;

/**
 * This class demonstrates the usage of Panel in AWT.
 * It creates a frame with a panel that has a red background color.
 */
public class PanelExample extends Frame{
    
    public PanelExample(){
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setTitle("Panel"); // Set the title of the frame
        
        Panel p = new Panel(); // Create a new Panel
        p.setBackground(Color.red); // Set the background color of the panel to red
        add(p); // Add the panel to the frame
        
    }
    
    public static void main(String[] args)
    {
        new PanelExample();
    }
    
}
