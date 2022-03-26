package ui;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPalette1Listener implements ActionListener {
    private boolean alreadyEnabled = false;
    private Palette palette;
    private JButton button;
    private Color color;

    public AddPalette1Listener(JButton button, Color color) {
        this.button = button;
        this.color = color;
    }

    // MODIFIES: currentProject, needlePanel
    // EFFECTS: adds user input to the currentProject's list of needles. Also adds it to needleNameList.
    @Override
    public void actionPerformed(ActionEvent e) {
        String cname = color.toString();
        this.button.setName("section color = " + cname);

    }
}
