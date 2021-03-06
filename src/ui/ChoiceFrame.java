package ui;

import javax.security.auth.callback.CallbackHandler;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceFrame extends JFrame implements ActionListener {
    private static final String THICKSQUARE = "src/imagesOriginal/thick_square.jpg";
    private static final String CIRCLES = "src/imagesOriginal/circles.jpeg";
    private static final String BOBA = "src/imagesOriginal/boba.jpg";
    private static final String TIGER = "src/imagesOriginal/tiger.jpeg";
    private static final String PENGUINBALLOON = "src/imagesOriginal/penguinballoon.jpeg";
    private static final String PAINTBYNUMCANDLE = "src/imagesOriginal/paintbynumbercandle.jpeg";

    private final static int WIDTH = 500;
    private final static int HEIGHT = 300;

    private JButton square;
    private JButton circles;
    private JButton boba;
    private JButton tiger;
    private JButton penguinBalloon;
    private JButton candle;

    public ChoiceFrame() {
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initComponents() {
        square = new JButton("Square");
        square.addActionListener(this);

        boba = new JButton("Boba");
        boba.addActionListener(this);

        tiger = new JButton("Tiger");
        tiger.addActionListener(this);

        penguinBalloon = new JButton("Penguin Balloon");
        penguinBalloon.addActionListener(this);

        candle = new JButton("Candle");
        candle.addActionListener(this);

        add(square);
        add(boba);
        add(tiger);
        add(penguinBalloon);
        add(candle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
