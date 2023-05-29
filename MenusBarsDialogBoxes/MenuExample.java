package MenusBarsDialogBoxes;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 * This class demonstrates the usage of menus in a Java AWT Frame.
 */
public class MenuExample extends Frame {

    /**
     * Constructs a new MenuExample object.
     */
    public MenuExample() {
        setSize(700, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Menu Example");

        // Create the menu bar
        MenuBar bar = new MenuBar();
        setMenuBar(bar);

        // Create the "File" menu and add it to the menu bar
        Menu mFile = new Menu("File");
        bar.add(mFile);

        // Create the "New" and "Save" menu items and add them to the "File" menu
        MenuItem mNew = new MenuItem("New");
        MenuItem mSave = new MenuItem("Save");
        mFile.add(mNew);
        mFile.add(mSave);

        // Create the "Edit" menu and add it to the menu bar
        Menu mEdit = new Menu("Edit");
        bar.add(mEdit);

        // Create the "Copy", "Paste", "Undo", and "Redo" menu items and add them to the "Edit" menu
        MenuItem mCopy = new MenuItem("Copy");
        MenuItem mPaste = new MenuItem("Paste");
        MenuItem mUndo = new MenuItem("Undo");
        MenuItem mRedo = new MenuItem("Redo");
        mEdit.add(mCopy);
        mEdit.add(mPaste);
        mEdit.add(mUndo);
        mEdit.add(mRedo);

        // Create the "View" menu and add it to the menu bar
        Menu mView = new Menu("View");
        bar.add(mView);

        // Create the "Editor" and "Split" menu items and add them to the "View" menu
        MenuItem mEditor = new MenuItem("Editor");
        MenuItem mSplit = new MenuItem("Split");
        mView.add(mEditor);
        mView.add(mSplit);
    }

    /**
     * The main method creates an instance of MenuExample.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        new MenuExample();
    }
}
