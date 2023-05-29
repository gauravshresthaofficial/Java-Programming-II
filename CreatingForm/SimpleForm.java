/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreatingForm;

/**
 * This class demonstrates the creation of a simple form using Java AWT components.
 */
import java.awt.*;
public class SimpleForm extends Frame {
    
    Label lblFirst; // Label for the name field
    TextField txtFirst; // Text field for entering the name
    Checkbox studying, football, programming; // Checkboxes for selecting hobbies
    Choice section; // Drop-down menu for selecting a section
    Button submit; // Button to submit the form
    
    /**
     * Constructs a new SimpleForm object.
     */
    public SimpleForm() {
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new FlowLayout()); // Set the layout manager for the frame
        setTitle("Simple Form"); // Set the title of the frame
        
        // Create components
        lblFirst = new Label("Name"); // Create the "Name" label
        txtFirst = new TextField(20); // Create the text field for entering the name
        studying = new Checkbox("Studying"); // Create the "Studying" checkbox
        football = new Checkbox("Football"); // Create the "Football" checkbox
        programming = new Checkbox("Programming"); // Create the "Programming" checkbox
        section = new Choice(); // Create the drop-down menu for selecting a section
        section.add("Select Section"); // Add section options to the menu
        section.add("Sec A");
        section.add("Sec B");
        submit = new Button("Submit"); // Create the "Submit" button
        
        // Add components to the frame
        add(lblFirst);
        add(txtFirst);
        add(studying);
        add(football);
        add(programming);
        add(section);
        add(submit);
    }
    
    /**
     * The main method creates an instance of SimpleForm.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new SimpleForm();
    }
}
