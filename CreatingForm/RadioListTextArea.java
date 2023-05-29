/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreatingForm;

/**
 * This class demonstrates the creation of a simple form using Java AWT components.
 */
import java.awt.*;
public class RadioListTextArea extends Frame {
    
    Label name; // Label for the name field
    Label Gender; // Label for the gender field
    TextField txtName; // Text field for entering the name
    TextArea area; // Text area for additional comments
    List subject; // List of subjects
    Checkbox male, female; // Checkboxes for selecting gender
    Button submit; // Button to submit the form
    
    /**
     * Constructs a new RadioListTextArea object.
     */
    public RadioListTextArea() {
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new FlowLayout()); // Set the layout manager for the frame
        setTitle("Simple Form"); // Set the title of the frame
        
        CheckboxGroup gender = new CheckboxGroup(); // Create a CheckboxGroup for gender selection
        
        name = new Label("Name"); // Create the "Name" label
        txtName = new TextField(20); // Create the text field for entering the name
        Gender = new Label("Gender"); // Create the "Gender" label
        male = new Checkbox("Male", gender, true); // Create the "Male" checkbox
        female = new Checkbox("Female", gender, false); // Create the "Female" checkbox
        area = new TextArea(10, 20); // Create the text area for additional comments
        subject = new List(); // Create the list of subjects
        subject.add("Java II"); // Add subject options to the list
        subject.add("AIW");
        subject.add("Computer Graphics");
        submit = new Button("Submit"); // Create the "Submit" button
        
        // Add components to the frame
        add(name);
        add(txtName);
        add(Gender);
        add(male);
        add(female);
        add(area);
        add(subject);
        add(submit);
    }
    
    /**
     * The main method creates an instance of RadioListTextArea.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new RadioListTextArea();
    }
}
