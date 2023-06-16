package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Students
 */
public class JOptionPaneExample extends JFrame {

    public JOptionPaneExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());

    //        JOptionPane Z = new JOptionPane(JOptionPane.showConfirmDialog(this, "Are you sure"));
    
        int res = JOptionPane.showConfirmDialog(this, "Are you Sure ?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == 0) {
            JOptionPane.showMessageDialog(null, "Deletion Successful");
        }
//        else if(res == 1){
//            JOptionPane.showMessageDialog(null, "Deletion Cancel");
//        }
        else {
            JOptionPane.showMessageDialog(null, "Deletion Cancel");
        }

    }

    public static void main(String[] args) {
        new JOptionPaneExample();
    }
}
