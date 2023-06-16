package IntroducingandExploringSwing;

import java.awt.*;
import javax.swing.*;

/**
 * This class demonstrates the usage of menus in a Java AWT Frame.
 */
public class MenuSwing extends JFrame {

    /**
     * Constructs a new MenuExample object.
     */
    public MenuSwing() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Menu Example Using Swing");

        // Create the menu bar
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        // Create the "File" menu and add it to the menu bar
        JMenu mFile = new JMenu("File");
        bar.add(mFile);

        // Create the "New" and "Save" menu items and add them to the "File" menu
        JMenuItem mNew = new JMenuItem("New");
        JMenuItem mSave = new JMenuItem("Save");
        mFile.add(mNew);
        mFile.add(mSave);

        // Create the "Edit" menu and add it to the menu bar
        JMenu mEdit = new JMenu("Edit");
        bar.add(mEdit);

        // Create the "Copy", "Paste", "Undo", and "Redo" menu items and add them to the "Edit" menu
        JMenuItem mCopy = new JMenuItem("Copy");
        JMenuItem mPaste = new JMenuItem("Paste");
        JMenuItem mUndo = new JMenuItem("Undo");
        JMenuItem mRedo = new JMenuItem("Redo");
        mEdit.add(mCopy);
        mEdit.add(mPaste);
        mEdit.add(mUndo);
        mEdit.add(mRedo);

        // Create the "View" menu and add it to the menu bar
        JMenu mView = new JMenu("View");
        bar.add(mView);

        // Create the "Editor" and "Split" menu items and add them to the "View" menu
        JMenuItem mEditor = new JMenuItem("Editor");
        JMenuItem mSplit = new JMenuItem("Split");
        mView.add(mEditor);
        mView.add(mSplit);
    }

    /**
     * The main method creates an instance of MenuExample.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new MenuSwing();
    }
}
