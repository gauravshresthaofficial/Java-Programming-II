package seca;

import java.awt.*;

/**
 * A class that demonstrates the use of BorderLayout in a frame with buttons.
 */
public class Border_Layout extends Frame {
    Border_Layout(){
        setSize(700,500);
        setVisible(true);
        setLayout(new BorderLayout());
       
        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");
       
        // Add buttons to the frame using BorderLayout positions
        add(b1, BorderLayout.NORTH);   // Button at the top
        add(b2, BorderLayout.SOUTH);   // Button at the bottom
        add(b3, BorderLayout.EAST);    // Button at the right
        add(b4, BorderLayout.WEST);    // Button at the left
        add(b5, BorderLayout.CENTER);  // Button at the center
    }
   
    public static void main(String[] args){
        // Create an instance of Border_Layout
        new Border_Layout();
    }
}
