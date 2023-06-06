
package UnderstandingLayoutManager;

import java.awt.*;
public class GridBagLayoutExample extends Frame{
    
    public GridBagLayoutExample() {
        GridBagConstraints gbc = new GridBagConstraints();
        setSize(300, 300); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(new GridBagLayout()); // Set the layout manager for the frame
        setTitle("GridBag Layout"); // Set the title of the frame
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(new Button("Button One"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new Button("Button Two"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new Button("Button Three"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new Button("Button Four"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(new Button("Button Five"), gbc);
    }
    public static void main(String[] args) {  
        GridBagLayoutExample a = new GridBagLayoutExample();
    }
}
