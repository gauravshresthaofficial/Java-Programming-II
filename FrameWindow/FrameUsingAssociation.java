/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FrameWindow;

/**
 * This class demonstrates the creation of a Java AWT frame using association.
 */
import java.awt.*;
public class FrameUsingAssociation {
    
    /**
     * Constructs a new FrameUsingAssociation object.
     */
    public FrameUsingAssociation() {
        Frame f = new Frame(); // Create a new Frame object
        f.setSize(700, 500); // Set the size of the frame
        f.setVisible(true); // Make the frame visible
        f.setLayout(new FlowLayout()); // Set the layout manager for the frame
        f.setTitle("First Frame"); // Set the title of the frame
    }
    
    /**
     * The main method creates an instance of FrameUsingAssociation.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new FrameUsingAssociation();
    }
}
