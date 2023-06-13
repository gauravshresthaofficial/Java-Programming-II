package IntroducingandExploringSwing;

/**
 * The DisplayImage class demonstrates the display of an image using Swing components.
 * It extends the JFrame class to create a window for displaying the image.
 */
import java.awt.*;
import javax.swing.*;
public class DisplayImage extends JFrame {

    JLabel lblImage;

    /**
     * Constructs a new DisplayImage object and initializes the frame.
     * Sets the size, visibility, and layout manager of the frame.
     * Sets the title of the frame.
     * Creates a JLabel to display the image.
     * Loads the image using an ImageIcon and sets it as the icon of the label.
     * Adds the label to the frame.
     */
    public DisplayImage() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Display Image");

        // Create a label to display the image
        lblImage = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\Students.DESKTOP-E64T97K\\Documents\\NetBeansProjects\\SecA\\Image\\image.png");
        lblImage.setIcon(icon);

        // Add the label to the frame
        add(lblImage);
    }

    /**
     * The main method creates an instance of DisplayImage and displays the image.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        new DisplayImage();
    }
}
