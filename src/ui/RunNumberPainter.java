package ui;

import main.NumberPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RunNumberPainter extends JFrame implements ActionListener {
    private static final String PENGUIN  = "src/imagesOriginal/boba.jpg";
    protected final static int WIDTH = 800;
    protected final static int HEIGHT = 1000;

    private NumberPainter painter;
    private ImageIcon image;

    public RunNumberPainter() {
        super("Number Paint");
        painter = new NumberPainter(PENGUIN);
        painter.getStencil();
        setSize(WIDTH, HEIGHT);
        //setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        //initComponents();
        JComponent newContentPane = new ColorPicker();
        newContentPane.setOpaque(true); //content panes must be opaque
        setContentPane(newContentPane);


        image = new ImageIcon(PENGUIN);
        JLabel imgLabel = new JLabel(image);
        imgLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ColorPicker currColorPane = (ColorPicker) newContentPane;
                Color currColor = currColorPane.getPalette().getColor();
                painter.changeRegionColor(0, currColor);
                painter.renderImage("boba.jpg");
                image = new ImageIcon("src/imagesAltered/boba.jpg");
                imgLabel.setIcon(image);
            }
        });
        add(imgLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
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
