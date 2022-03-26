package UI;

import Main.NumberPainter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunNumberPainter extends JFrame implements ActionListener {
    private static final String PENGUIN  = "penguin.jpeg";

    private NumberPainter painter;

    public RunNumberPainter() {
        painter = new NumberPainter(PENGUIN);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //EFFECTS: runs the GUI of the farm
    public static void main(String[] args) {
        new RunNumberPainter();
    }
}
