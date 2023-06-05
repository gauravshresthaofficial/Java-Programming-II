package seca;

import java.awt.Button;
import java.awt.Frame;

public class Null_Layout extends Frame {
    Null_Layout() {
        setSize(700, 500);
        setVisible(true);
        setLayout(null);

        // Create and position the button
        Button b1 = new Button("North");
        b1.setBounds(40, 40, 40, 30);

        // Add the button to the frame
        add(b1);
    }

    public static void main(String[] args) {
        // Create an instance of Null_Layout
        new Null_Layout();
    }
}
