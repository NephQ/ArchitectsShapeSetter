package userInterface;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
import labTasks.IFurniture;
import labTasks.Chair;
import labTasks.Desk;
import labTasks.FurnitureList;

public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    public FurnitureList myFurnitureList = new FurnitureList();
    public PaintPanel() {
        int furnitures = getRandomFurnitureNumber();
        for (int i = 0; i < furnitures; i++) {
            IFurniture chair = new Chair();
            IFurniture desk = new Desk();
            myFurnitureList.add(chair);
            myFurnitureList.add(desk);
        }
        for (int i = 0; i < myFurnitureList.size(); i++) {
            myFurnitureList.get(i).setX(getRandomValue());
            myFurnitureList.get(i).setY(getRandomValue());
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphic2d = (Graphics2D) g;
        for (IFurniture furniture : myFurnitureList) {
            furniture.paintFurniture(graphic2d);
        }
    }
    public void shiftAllElements(int mx, int my) {
        myFurnitureList.shiftAllElements(mx, my);
        repaint();
    }
    public int getRandomValue() {
        Random random = new Random();
        return random.nextInt(600);
    }
    public int getRandomFurnitureNumber() {
        Random random2 = new Random();
        return random2.nextInt(1,5);
    }
}