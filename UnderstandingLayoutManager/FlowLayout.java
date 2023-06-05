package seca;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * A class that demonstrates the use of FlowLayout in a frame with buttons.
 */
public class Flow_Layout extends Frame {
    Flow_Layout() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        
        // Create buttons
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
       
        // Add buttons to the frame
        add(b1);
        add(b2);
    }
   
    public static void main(String[] args) {
        // Create an instance of Flow_Layout
        new Flow_Layout();
    }
}
