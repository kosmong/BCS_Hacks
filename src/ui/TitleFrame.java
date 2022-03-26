package ui;

import main.NumberPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleFrame extends JFrame implements ActionListener {
    protected final static int WIDTH = 500;
    protected final static int HEIGHT = 600;
    private static final String PENGUIN  = "src/imagesOriginal/doublepenguin.jpeg";


    private NumberPainter painter;
    private JLabel description;
    private JButton start;
    private ImageIcon image;

    public TitleFrame() {
        super("Number Painter! No Penguins!");

        setSize(WIDTH, HEIGHT);

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel display = new JPanel();
        display.setLayout(new FlowLayout(FlowLayout.CENTER));

        image = new ImageIcon(PENGUIN);
        JLabel imageLabel = new JLabel(image);
        display.add(imageLabel);

        add(display);

        JPanel text = new JPanel();
        text.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel title = new JLabel("Colour Phil");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        text.add(title);

        start = new JButton("Start!");
        start.addActionListener(this);
        text.add(start);

        add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(start)) {
            new ChoiceFrame();
        }
    }

    //EFFECTS: runs the GUI of the farm
    public static void main(String[] args) {
        new TitleFrame();
    }
}
