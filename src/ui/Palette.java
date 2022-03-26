package ui;

import javax.swing.*;
import java.awt.*;

public class Palette extends JPanel {
    private JButton palette1;
    private static final String COLOUR1 = "Section 1 Colour";
    //private AddPalette1Listener addPalette1Listener;

//    public Palette(Color color) {
//        super(new BorderLayout());
//
//        add(initializeButton1(color), BorderLayout.PAGE_END);
//    }
//
//    public JButton makeButton1(color) {
//        palette1 = new JButton(COLOUR1);
//        addPalette1Listener = new AddPalette1Listener(palette1, this, color);
//        palette1.setActionCommand(addString);
//        palette1.addActionListener(addNoteListener);
//        palette1.setEnabled(false);
//
//        return palette1;
//    }
//
//    // EFFECTS: Returns all buttons (add and remove) and textfields in one JPanel.
//    public JPanel initializeButton1(KnittingProject kp) {
//        JButton addButton = makeAddButtonAndText(kp);
//
//        //Create a panel that uses BoxLayout.
//        JPanel buttonPane = new JPanel();
//        buttonPane.setLayout(new BoxLayout(buttonPane,
//                BoxLayout.LINE_AXIS));
//
//        buttonPane.add(addButton);
//        buttonPane.add(noteInput);
//        buttonPane.add(Box.createHorizontalStrut(5));
//        buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
//        buttonPane.add(Box.createHorizontalStrut(5));
//
//        buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        return buttonPane;
//    }
}
