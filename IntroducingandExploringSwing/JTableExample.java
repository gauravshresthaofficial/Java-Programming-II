package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Students
 */
public class JTableExample extends JFrame {

    public JTableExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        String cols[] = {"Roll", "Name"};
        String rows[][] = {{"1", "Ram"}, {"2", "Shyam"}, {"3", "Hari"}, {"4", "Sita"}, {"5", "Rita"}, {"6", "Gita"}};

        JTable table = new JTable(rows, cols);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        JSlider slider = new JSlider(0, 100);
        add(slider);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}
