package program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import labTasks.FurnitureOutOfBorderException;
import userInterface.PaintPanel;
import labTasks.FurnitureList;
import labTasks.IFurniture;
import labTasks.abstractFurniture;
public class ProgramMain {
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter (ASS)");
        frame.setLayout(new BorderLayout());
        PaintPanel paintPanel = new PaintPanel();
        frame.add(paintPanel,BorderLayout.CENTER);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//button wurde erzeugt und mit ActionListener bekommt eine Funktion
        JButton button = new JButton("Switch");
        button.setVisible(true);
        frame.add(button,BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)   {
                paintPanel.shiftAllElements(100, 100);  // Shift the furniture by (5, 5)
                paintPanel.repaint();
            }
        });
        try {
            FurnitureOutOfBorderException.checkFurnitureInBox("Error", paintPanel.myFurnitureList);
        }
        catch (FurnitureOutOfBorderException ex) {
            System.err.println(ex);
        }
    }}
