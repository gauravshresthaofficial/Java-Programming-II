package UnderstandingLayoutManager;

import java.awt.*;

public class CardLayoutExample extends Frame {

    static CardLayout cl = new CardLayout();

    public CardLayoutExample() {
        setSize(700, 500); // Set the size of the frame
        setVisible(true); // Make the frame visible
        setLayout(cl); // Set the layout manager for the frame
        setTitle("Card Layout"); // Set the title of the frame

        // Create panels with different background colors
        Panel p1 = new Panel();
        p1.setBackground(Color.red);
        Panel p2 = new Panel();
        p2.setBackground(Color.green);
        Panel p3 = new Panel();
        p3.setBackground(Color.blue);
        Panel p4 = new Panel();
        p4.setBackground(Color.black);

        // Add panels to the frame with corresponding names
        add(p1, "Red");
        add(p2, "Green");
        add(p3, "Blue");
        add(p4, "Black");
    }

    public static void main(String[] args) {
        CardLayoutExample ce = new CardLayoutExample();

        // You can use the following methods to navigate through the cards
        // cl.first(ce);    // Show the first card
        // cl.previous(ce); // Show the previous card
        // cl.next(ce);     // Show the next card
        // cl.last(ce);     // Show the last card

        cl.show(ce, "Blue"); // Show the card with the specified name ("Blue")
    }
}
