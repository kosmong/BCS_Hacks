package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palette extends JPanel {
    private JButton palette1;
    private JButton palette2;
    private static final String COLOUR1 = "No Section 1 Colour";
    private static final String COLOUR2 = "No Section 2 Colour";
    private Color c;
    private Color c2;

    public Palette(Color color) {
        super(new BorderLayout());
        c = color;
        add(initializeButton1(color), BorderLayout.PAGE_END);
    }

    public void setColor(Color color){
        this.c = color;
    }

    public Color getColor(){
        return this.c;
    }

    public JButton makeButton1(Color color) {
        palette1 = new JButton(COLOUR1);
        palette1.setName(COLOUR1);
        palette1.setText(COLOUR1);
        palette1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                palette1.setText("Section 1 Color");
                palette1.setOpaque(true);
                palette1.setBackground(c);
            }
        });
        palette1.setEnabled(true);

        return palette1;
    }

    public JButton makeButton2(Color color) {
        palette1 = new JButton(COLOUR1);
        palette1.setName(COLOUR1);
        palette1.setText(COLOUR1);
        palette1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                palette1.setText("Section 1 Color");
                palette1.setOpaque(true);
                palette1.setBackground(c);
            }
        });
        palette1.setEnabled(true);

        return palette1;
    }

    // EFFECTS: Returns all buttons (add and remove) and textfields in one JPanel.
    public JPanel initializeButton1(Color color) {
        JButton button1 = makeButton1(color);

        //Create a panel that uses BoxLayout.
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane,
                BoxLayout.LINE_AXIS));

        buttonPane.add(button1);
//        buttonPane.add(Box.createHorizontalStrut(5));
//        buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
//        buttonPane.add(Box.createHorizontalStrut(5));

        //buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        return buttonPane;
    }
}
