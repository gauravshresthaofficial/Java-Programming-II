//WAP to show and hide the textField on Check ON/OFF.
package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShowandHideTextField extends JFrame implements ItemListener{
    JCheckBox chkStatus;
    JPasswordField txtPassword;

    public ShowandHideTextField() {
        setSize(700,500);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txtPassword = new JPasswordField(10);
        chkStatus = new JCheckBox("Show/Hide",true);
        
        add(txtPassword);
        add(chkStatus);
        chkStatus.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e){
        if(chkStatus.isSelected())
        {
            txtPassword.setVisible(true);
        }
        else {
         {
            txtPassword.setVisible(false);
        }   
        }
    }
    
    public static void main(String[] args) {
        new ShowandHideTextField();
    }
    
}
