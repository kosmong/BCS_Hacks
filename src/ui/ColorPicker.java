package ui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/ColorChooserDemoProject/src/components/ColorChooserDemo.java
 */

public class ColorPicker extends JPanel
        implements ChangeListener {

    protected JColorChooser tcc;
    protected Palette palette;


    public ColorPicker() {
        super(new BorderLayout());

        palette = new Palette(Color.WHITE);

        //Set up color chooser for setting text color
        tcc = new JColorChooser(Color.WHITE);

        tcc.setPreviewPanel(new JPanel());
        tcc.setPreferredSize(new Dimension(800, 200));
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                "Choose Section Color"));

        add(palette, BorderLayout.PAGE_START);
        add(tcc, BorderLayout.PAGE_END);
    }

    public Palette getPalette(){
        return palette;
    }

    public void stateChanged(ChangeEvent e) {
        Color newColor = tcc.getColor();
        palette.setColor(newColor);
    }
}

