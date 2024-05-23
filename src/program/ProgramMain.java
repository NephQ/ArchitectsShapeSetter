package program;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.PaintPanel;
public class ProgramMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter (ASS)");
        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Switch");
        button.setBounds(450,800,100,100);
        frame.add(button);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Furniture moved!");
            }

        });
    }

}