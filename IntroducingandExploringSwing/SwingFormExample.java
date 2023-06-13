package IntroducingandExploringSwing;

/**
 * The SwingFormExample class demonstrates the usage of various Swing components to create a simple form.
 * It extends the JFrame class to create a window for the form.
 */
import java.awt.*;
import javax.swing.*;
public class SwingFormExample extends JFrame {

    JLabel lblFirst;
    JTextField txtFirst;
    JCheckBox chkApple;
    JComboBox cmbCountry;
    JRadioButton rdoMale, rdoFemale;
    JTextArea area;
    JButton btnSubmit;

    /**
     * Constructs a new SwingFormExample object and initializes the form.
     * Sets the size, visibility, and layout manager of the frame.
     * Creates and configures the form components.
     * Adds the components to the frame.
     */
    public SwingFormExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        // Create and configure the components
        lblFirst = new JLabel("Firstname");
        txtFirst = new JTextField(20);
        cmbCountry = new JComboBox();
        cmbCountry.addItem("Select Country");
        cmbCountry.addItem("Nepal");
        cmbCountry.addItem("USA");
        cmbCountry.addItem("UK");

        chkApple = new JCheckBox("Apple");

        ButtonGroup bg = new ButtonGroup();
        rdoMale = new JRadioButton("Male", true);
        rdoFemale = new JRadioButton("Female", false);
        bg.add(rdoMale);
        bg.add(rdoFemale);

        area = new JTextArea(10, 10);
        JScrollPane sp = new JScrollPane(area);

        btnSubmit = new JButton("Submit");

        // Add the components to the frame
        add(lblFirst);
        add(txtFirst);
        add(cmbCountry);
        add(chkApple);
        add(rdoMale);
        add(rdoFemale);
        add(sp);
        add(btnSubmit);
    }

    /**
     * The main method creates an instance of SwingFormExample and displays the form.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        new SwingFormExample();
    }

}
