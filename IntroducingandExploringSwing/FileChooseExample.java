package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Students
 */
public class FileChooseExample extends JFrame{
    public FileChooseExample(){
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
    }
    
    public static void main(String[] args){
     new FileChooseExample();
    }
}
