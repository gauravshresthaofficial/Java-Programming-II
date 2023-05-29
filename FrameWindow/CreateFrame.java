/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FrameWindow;

/**
 * This class demonstrates the creation of a basic Java AWT frame.
 */
import java.awt.*;
public class CreateFrame extends Frame {
    
    /**
     * Constructs a new CreateFrame object.
     */
    public CreateFrame() {
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new FlowLayout()); // Set the layout manager for the frame
    }
    
    /**
     * The main method creates an instance of CreateFrame.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new CreateFrame();
    }
    
}
