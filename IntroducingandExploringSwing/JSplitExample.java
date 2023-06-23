

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Students
 */
public class JSplitExample extends JFrame{
    public JSplitExample() {
        setSize(700,500);
//        setLayout(new FlowLayout());
        setVisible(true);
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        
        JSplitPane p = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p2,p1);
        add(p);
     
        
    }
    public static void main (String[]args){
        new JSplitExample();
    }
}
