package UnderstandingLayoutManager;

import java.awt.*;

public class GridLayoutExample extends Frame {

    public GridLayoutExample() {
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new GridLayout(2, 2)); // Set the layout manager for the frame
        setTitle("Grid Layout"); // Set the title of the frame
        
        // Create and add components to the frame
        Button button1 = new Button("Button 1");
        add(button1);
        
        Button button2 = new Button("Button 2");
        add(button2);
        
        Button button3 = new Button("Button 3");
        add(button3);
        
        Button button4 = new Button("Button 4");
        add(button4);
    }
    
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
