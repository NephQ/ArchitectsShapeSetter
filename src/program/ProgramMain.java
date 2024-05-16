package program;
import javax.swing.JFrame;

import userInterface.PaintPanel;
public class ProgramMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter (ASS)");
        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}