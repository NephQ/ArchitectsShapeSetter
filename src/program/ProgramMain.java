package program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.PaintPanel;

public class ProgramMain {
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter (ASS)");
        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel);

        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
        JButton button = new JButton("Switch");
        frame.add(button);
        button.setVisible(true);
        button.setBounds(450,800,100,100);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintPanel.shift(5, 5);  // Shift the furniture by (5, 5)
            }
        });
    }}
