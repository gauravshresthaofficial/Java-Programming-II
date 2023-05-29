/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenusBarsDialogBoxes;

import java.awt.*;

/**
 * This class demonstrates the usage of FileDialog in Java AWT to browse for a file.
 */
public class FileDialogExample extends Frame {

    /**
     * Constructs a new FileDialogExample object.
     */
    public FileDialogExample() {

        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new FlowLayout()); // Set the layout manager for the frame
        setTitle("Simple Form"); // Set the title of the frame
        
        // Create a FileDialog with the parent frame, dialog title, and dialog mode
        FileDialog fd = new FileDialog(this, "Browse Photo", FileDialog.LOAD);
        fd.setVisible(true); // Display the file dialog to the user
    }
    
    /**
     * The main method creates an instance of FileDialogExample.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        new FileDialogExample();
    }
    
}
