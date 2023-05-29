/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenusBarsDialogBoxes;

/**
 * This class demonstrates the usage of Dialog Box in AWT.
 * It creates a frame with a dialog box that displays a message.
 */
import java.awt.*;

public class MessageDialogExample extends Frame{
    
    public MessageDialogExample(){
        setSize(700,500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        
        Dialog d = new Dialog(this,"Hello", true); // Create a new Dialog
        d.setSize(300,200); // Set the size of the dialog box
        d.setVisible(true); // Make the dialog box visible
    }
    
    public static void main(String[] args){
        new MessageDialogExample();
    }
}
