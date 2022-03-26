package ui;

import main.NumberPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunNumberPainter extends JFrame implements ActionListener {
    private static final String PENGUIN  = "src/imagesOriginal/penguin.jpeg";
    protected final static int WIDTH = 800;
    protected final static int HEIGHT = 1000;

    private NumberPainter painter;
    private ImageIcon image;

    public RunNumberPainter() {
        super("Number Paint");
        painter = new NumberPainter(PENGUIN);
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        //initComponents();
        image = new ImageIcon(PENGUIN);
        add(new JLabel(image));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //EFFECTS: runs the GUI of the farm
    public static void main(String[] args) {
        new RunNumberPainter();
    }
}
