package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.PaintPanel;
import labTasks.FurnitureOutOfBorderException;

public class ProgramMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter (ASS)");
        frame.setLayout(new BorderLayout());
        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel, BorderLayout.CENTER);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Switch");
        frame.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintPanel.shiftAllElements(100, 100); // Shift the furniture by (100, 100)
                paintPanel.repaint();
            }
        });
    }
}